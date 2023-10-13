package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "teachers", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TeacherConjuntoGroup> teacherConjuntoGroups;

    public Teachers() {
        this.teacherConjuntoGroups = new ArrayList<>();
    }

    public Teachers(String name, String lastName) {
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

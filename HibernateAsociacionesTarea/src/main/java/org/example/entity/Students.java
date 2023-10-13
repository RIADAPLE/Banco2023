package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "id_groups")
    private Conjuntos conjuntos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Marks> marks;

    public Students() {
        this.marks = new ArrayList<>();
    }

    public Students(String name, String lastName) {
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

    public Conjuntos getGroups() {
        return conjuntos;
    }

    public void setGroups(Conjuntos conjuntos) {
        this.conjuntos = conjuntos;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groups=" + conjuntos.getName() +
                ", marks=" + marks +
                '}';
    }
}

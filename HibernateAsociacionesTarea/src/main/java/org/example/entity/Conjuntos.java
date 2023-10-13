package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conjuntos")
public class Conjuntos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "tbl_groups_students", joinColumns = @JoinColumn(name="id_groups")
            , inverseJoinColumns = @JoinColumn(name = "id_student")
            , uniqueConstraints = @UniqueConstraint(columnNames = {"id_student"}))
    private List<Students> students;

    @OneToMany(mappedBy = "conjuntos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TeacherConjuntoGroup> teacherConjuntoGroups;

    public Conjuntos() {
        this.students = new ArrayList<>();
    }

    public Conjuntos(String name) {
        this();
        this.name = name;
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

   public Conjuntos addStudent(Students student) {
        this.students.add(student);
        student.setGroups(this);
        return this;
    }

    public void removeStudent(Students student) {
        this.students.remove(student);
        student.setGroups(null);
    }

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student='" + students +
                '}';
    }
}

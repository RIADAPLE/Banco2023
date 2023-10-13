package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers_conjuntos_groups")
public class TeacherConjuntoGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "teachers_id")
    private Teachers teachers;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "subjects_id")
    private Subjects subjects;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "conjuntos_id")
    private Conjuntos conjuntos;

    public TeacherConjuntoGroup() {
    }

    public TeacherConjuntoGroup(Teachers teachers, Subjects subjects, Conjuntos conjuntos) {
        this.teachers = teachers;
        this.subjects = subjects;
        this.conjuntos = conjuntos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherSubjectGroup{" +
                "id=" + id +
                ", teachers=" + teachers.getName() +
                ", subjects=" + subjects.getTitle() +
                ", groups=" + conjuntos.getName() +
                '}';
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Conjuntos getGroups() {
        return conjuntos;
    }

    public void setGroups(Conjuntos conjuntos) {
        this.conjuntos = conjuntos;
    }
}

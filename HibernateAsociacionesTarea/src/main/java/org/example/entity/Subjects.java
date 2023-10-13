package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "subjects", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TeacherConjuntoGroup> teacherConjuntoGroups;

    public Subjects() {
        this.teacherConjuntoGroups = new ArrayList<>();
    }

    public Subjects(String title) {
        this();
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

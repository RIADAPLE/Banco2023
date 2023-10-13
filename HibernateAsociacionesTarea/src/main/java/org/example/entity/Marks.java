package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_students")
    private Students students;

    @ManyToOne
    @JoinColumn(name = "id_subjects")
    private Subjects subjects;

    private Date date;

    private int mark;

    public Marks() {
    }

    public Marks(Date date, int mark) {
        this();
        this.date = date;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", students=" + students.getName() +
                ", subjects=" + subjects.getTitle() +
                ", date=" + date +
                ", mark=" + mark +
                '}';
    }
}

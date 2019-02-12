package org.fasttrackit.collegeservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class CollegeMajor {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int major;
    private int availableSpots;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CollegeMajor{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
       // sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}

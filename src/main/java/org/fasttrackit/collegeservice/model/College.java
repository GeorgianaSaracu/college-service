package org.fasttrackit.collegeservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ttritean
 * @since 1/15/2019
 */
@Entity
public class College {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private List<Student> students = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private List<CollegeMajor> collegeMajors = new ArrayList<>();

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

    public List<CollegeMajor> getCollegeMajors() {
        return collegeMajors;
    }

    public void setCollegeMajors(List<CollegeMajor> collegeMajors) {
        this.collegeMajors = collegeMajors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("College{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
       // sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}

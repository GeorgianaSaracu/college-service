package org.fasttrackit.collegeservice.dto;


public class StudentDTO {
    private long id;
    private String firstName;
    private String lastName;
    private int majorOption;
    private double averageScore;

    public StudentDTO() {
    }

    public StudentDTO(String lastName, String firstName, double averageScore, int majorOption) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.averageScore = averageScore;
        this.majorOption = majorOption;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMajorOption() {
        return majorOption;
    }

    public void setMajorOption(int majorOption) {
        this.majorOption = majorOption;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}

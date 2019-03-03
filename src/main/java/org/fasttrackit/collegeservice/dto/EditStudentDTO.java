package org.fasttrackit.collegeservice.dto;


public class EditStudentDTO {
    private long studentId;
    private long majorId;

    public EditStudentDTO() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getMajorId() {
        return majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }
}



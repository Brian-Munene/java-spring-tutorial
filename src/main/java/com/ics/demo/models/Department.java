package com.ics.demo.models;

public class Department {
    private int studentId;
    private int companyId;
    private int departmentId;

    public Department(int studentId, int companyId, int departmentId) {
        this.studentId = studentId;
        this.companyId = companyId;
        this.departmentId = departmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}

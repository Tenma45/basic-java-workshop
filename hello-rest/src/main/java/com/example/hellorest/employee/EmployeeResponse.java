package com.example.hellorest.employee;

import java.util.Objects;

public class EmployeeResponse{
    private int id;
    private String fname;
    private String lname;

    public EmployeeResponse() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeResponse employee = (EmployeeResponse) o;
        return id == employee.id &&
                Objects.equals(fname, employee.fname) &&
        Objects.equals(lname, employee.lname);
    }

    public EmployeeResponse(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getFname(){
        return fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public String getLname(){
        return lname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
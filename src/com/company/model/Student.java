package com.company.model;

public class Student {

    private String studentName;
    private String studentGender;
    public static String TAG = "student";
    private int studentBudget;

    public Student(String studentName, String studentGender, int studentBudget) {
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBudget = studentBudget;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public int getStudentBudget() {
        return studentBudget;
    }

    public void setStudentBudget(int studentBudget) {
        this.studentBudget = studentBudget;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", TAG='" + TAG + '\'' +
                ", studentBudget=" + studentBudget +
                '}';
    }
}

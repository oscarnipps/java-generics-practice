package com.company.model;

public class Teacher {
    private String teacherName;
    private String teacherGender;
    public static String TAG = "teacher";
    private int teacherBudget;


    public Teacher(String teacherName, String teacherGender, int teacherBudget) {
        this.teacherName = teacherName;
        this.teacherGender = teacherGender;
        this.teacherBudget = teacherBudget;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public int getTeacherBudget() {
        return teacherBudget;
    }

    public void setTeacherBudget(int teacherBudget) {
        this.teacherBudget = teacherBudget;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherGender='" + teacherGender + '\'' +
                ", TAG='" + TAG + '\'' +
                ", teacherBudget=" + teacherBudget +
                '}';
    }
}

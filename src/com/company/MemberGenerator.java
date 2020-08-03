package com.company;

import com.company.model.Student;
import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class MemberGenerator {

    public static List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("james brown" , "male",10000));
        teachers.add(new Teacher("olu david" , "male",8000));
        teachers.add(new Teacher("cindy crawford" , "female",12000));
        teachers.add(new Teacher("sandra jeffery" , "female",20000));

        return teachers;
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("daniella jacobs" , "female",500));
        students.add(new Student("david greg" , "male",800));
        students.add(new Student("cindy taffy" , "female",400));
        students.add(new Student("princess biden" , "female",300));

        return students;
    }
}

package com.company;


import com.company.model.Student;
import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BudgetCalculator.getMemberBudget(MemberGenerator.getTeachers() , Teacher.TAG);
        BudgetCalculator.getMemberBudget(MemberGenerator.getStudents() , Student.TAG);

    }
}

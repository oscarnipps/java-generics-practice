package com.company;


import com.company.model.Student;
import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;

//
public class BudgetCalculator <T>{

    private T data;

    BudgetCalculator(T data) {
        this.data = data;
    }

    //generic method to calculate the total budget for any member
    public static <T> Integer getTotalBudget(List<T> items) {
        int amount = 0;
        
        for (T item : items) {
            if (item instanceof Student) {
                amount += ((Student) item).getStudentBudget();
                continue;
            }
            amount += ((Teacher) item).getTeacherBudget();
        }
        return amount;
    }

    //generic method with multiple generic types S and T
    public static <T ,S> void getMemberBudget(List<T> members , S memberTag) {
        System.out.println(String.format("total " + (String) memberTag + " budget : %,d", getTotalBudget(MemberGenerator.getTeachers())));
    }




}

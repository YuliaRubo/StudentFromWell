package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Users {

    private WorkPlan workPlan;


    public Teacher(String name, String surName) {
        super(name, surName);
    }

    public String creatWell(String name) {
        Well wellNew = new Well(name);
        return name;
    }

//public void getMark(Student student, Well well){
//        Grade grade=new Grade(5);
//        for(Student c: well.students);
//        System.out.println(student);
}






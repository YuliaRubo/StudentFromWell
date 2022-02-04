package com.company;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    List<Student>students = new ArrayList<>();
    private Grade grade;
    private Well well;

    public Archive(List<Student> students, Grade grade) {
        this.students = students;
        this.grade = grade;
    }




}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Well {
    private String name;
    List<Student> students = new ArrayList<>();


    public Well(String name, List<String> students) {
        this.name = name;

    }

    public Well(String name) {
        this.name = name;
    }

    public void addWellToTeacherWell(Student student) {
        students.add(student);
    }
}

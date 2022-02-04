package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Users{
    {
        iter++;
    }
    private static int iter=0;
    private int id=iter;
    private WorkPlan workPlan;
    private Well well;

    List<Well> wellNew = new ArrayList<>();

    public Student(String name, String surName) {
        super(name, surName);
    }

    public Well getWell() {
        return well;
    }

    public void setWell(Well well) {
        this.well = well;
    }

    public List<Well> getWellNew() {
        return wellNew;
    }

    public void setWellNew(List<Well> wellNew) {
        this.wellNew = wellNew;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher t1= new Teacher("Mark","Triton");
        Well music = new Well(t1.creatWell("Music"));

        music.addWellToTeacherWell(new Student("Petr","Sirov"));
        music.addWellToTeacherWell(new Student("Ziza","Rina"));
        music.addWellToTeacherWell(new Student("Wictor","Reti"));
        music.addWellToTeacherWell(new Student("Liza","Brouwn"));







    }
}

package org.example;

public class Student
{
    private String name;
    private String surname;
    private int[] grades;

    public Student(String name, String surname, int[] grades)
    {
        this.name = name;
        this.surname = name;
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
}

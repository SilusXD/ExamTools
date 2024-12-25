package org.example;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        StudentService studentService = new StudentService();

        students.add(new Student("A", "Aa",new int[]{5,2,3,5,2,4,3,5,1,5}));
        students.add(new Student("B", "Bb",new int[]{5,5,5,5,5,5,4,5,4,5}));
        students.add(new Student("G", "Gg",new int[]{5,5,5,5,5,5,5,5,5,5}));
        students.add(new Student("C", "Cc",new int[]{4,4,4,2,2,2,3,3,3,2}));

        Student student = studentService.bestStudents(students);
        System.out.println(student.getSurname());

        for (Student student1 : studentService.sortBySurname(students)) {
            System.out.println(student1.getSurname());
        }
    }
}
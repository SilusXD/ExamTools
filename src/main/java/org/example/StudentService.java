package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentService
{
    public Student bestStudents(ArrayList<Student> students)
    {
        double bestGrade = 0;
        Student bestStudent = null;

        for (Student student : students)
        {
            double sum = 0.0;
            double count = 0.0;
            double tempGrade;

            for (int grade : student.getGrades())
            {
                sum += grade;
                count += 1;
            }
            tempGrade = sum / count;

            if(tempGrade > bestGrade)
            {
                bestGrade = tempGrade;
                bestStudent = student;
            }
        }

        return bestStudent;
    }

    public ArrayList<Student> sortBySurname(ArrayList<Student> students)
    {

        students.sort(Comparator.comparing(Student::getSurname));
        return students;
    }
}

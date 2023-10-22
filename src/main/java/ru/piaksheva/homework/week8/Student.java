package ru.piaksheva.homework.week8;

public class Student {
    String surname;
    double grade;

    public Student(String surname, double grade) {
        this.surname = surname;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public double getGrade(double grade) {
        return this.grade = grade;
    }

    @Override
    public String toString() {
        return "[" + surname + ", " + grade + "]";
    }
}

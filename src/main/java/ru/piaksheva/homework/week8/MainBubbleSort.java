package ru.piaksheva.homework.week8;

import java.util.ArrayList;

public class MainBubbleSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Иванов", 4.5));
        students.add(new Student("Петров", 3.7));
        students.add(new Student("Сидоров", 4.2));
        students.add(new Student("Козлов", 5.0));
        students.add(new Student("Смирнов", 3.9));
        Student[] arr = students.toArray(new Student[0]);
        print(arr);
        bubbleSort(arr);
        System.out.println("--------------------------");
        print(arr);
    }

    public static void bubbleSort(Student[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1].grade < arr[j].grade) {
                    Student swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void print(Student[] arr) {
        for (Student student: arr) {
            System.out.println(student);
        }
    }
}

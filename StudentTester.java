package ru.mirea;

import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score;
        System.out.print("Кол-во студентов на входе: ");
        score = in.nextInt();
        System.out.print("\n");
        Student[] stud = new Student[score];

        for (int i = 0; i < score; i++) {

            stud[i] = new Student();

            System.out.print("Введите имя " + (i + 1) + " студента: ");
            stud[i].setName(in.next());
            System.out.print("\n");

            System.out.print("Введите ID " + (i + 1) + " студента: ");
            stud[i].setID(in.nextInt());
            System.out.print("\n");
        }

        Student.Q_Sort1(score-1, stud);

        System.out.print("Список студентов (отсорт.): \n");
        for(int i = 0; i < score; i++){
            System.out.print("Студент: " +stud[i].getName()+ ", ID: " +stud[i].getID()+ "\n");
        }
    }
}
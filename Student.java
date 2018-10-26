package ru.mirea;

public class Student {
    private String name;
    private int iDNumber;


    Student(){
        this.name = "non";
        this.iDNumber = 0;
    }

    Student(String name, int iDNumber){
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setID(int i){
        this.iDNumber = i;
    }
    public int getID(){
        return iDNumber;
    }

    public static void Q_Sort1 (int s, Student[] st_s){
        int begin = 0;
        int end = s;
        Q_Sort2(begin, end, st_s);
    }

    private static void Q_Sort2(int begin, int end, Student[] st_s){
        if (begin >= end)
            return;
        int i = begin;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j){
            while (i < cur && (st_s[i].iDNumber <= st_s[cur].iDNumber)){
                i++;
            }
            while (j > cur && (st_s[cur].iDNumber <= st_s[j].iDNumber)){
                j--;
            }
            if (i < j){
                Student temp = st_s[i];
                st_s[i] = st_s[j];
                st_s[j] = temp;
                if (i == cur){
                    cur = j;
                }else if (j == cur){
                    cur = i;
                }
            }
            Q_Sort2(begin, cur, st_s);
            Q_Sort2(cur+1, end, st_s);
        }
    }

    @Override
    public String toString(){
        return "Студент: " +name+ ", ID: " +iDNumber+ "\n";
    }

}
package chap7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student2> arrayList = new ArrayList<>();

        System.out.println("Enter student information");
        System.out.println();

        while (true) {
            System.out.print("student name : ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("department : ");
            String department = sc.nextLine();
            System.out.print("student # : ");
            String number = sc.next();
            System.out.print("average score : ");
            String avgScore = sc.next();
            arrayList.add(new Student2(name, department, number, avgScore));

            System.out.println();
            System.out.print("Are you finished entering the data? (Yes (Y), No (N)) : ");
            String flag = sc.next();
            if (flag.equals("y")) {
                break;
            }
        }

        Iterator<Student2> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Student2 {
    private String name, department, number, avgScore;

    public Student2(String name, String department, String number, String avgScore) {
        this.name = name;
        this.department = department;
        this.number = number;
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------" +
                "\nstudent name\t:\t" + name +
                "\ndepartment\t:\t" + department +
                "\nstudent #\t:\t" + number +
                "\navgScore\t:\t" + avgScore +
                "\n-------------------------------------------------------------\n";
    }
}
package chap4;

import java.util.Scanner;

class CallByValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person arrPerson[] = new Person[3];
        System.out.println("이름, 나이 : " + arrPerson.length + "명을 입력하시오");
        for (int i = 0; i < arrPerson.length; i++) {
            String name = scan.next();
            int age = scan.nextInt();
            arrPerson[i] = new Person(name, age);
        }
        for (int i = 0; i < arrPerson.length; i++) {
            arrPerson[i].increaseAge();
            arrPerson[i].printPerson();
        }
    }


}

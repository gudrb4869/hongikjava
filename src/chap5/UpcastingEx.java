package chap5;

class Person2 {
    String name;
    String id;

    public Person2(String name) {
        this.name = name;
    }
}

class Student extends Person2{
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class UpcastingEx {
    public static void main(String[] args) {
        Person2 p;
        Student s = new Student("이재문");
        p = s; // 업캐스팅 발생

        System.out.println(p.name);

//        p.grade = "A" // 컴파일 오류
//        p.department = "Com" // 컴파일 오류
    }
}

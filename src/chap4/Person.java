package chap4;

public class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void increaseAge() {
        age++;
    }

    public void printPerson() {
        System.out.println("이름 : " + name + " 나이 : " + age);
    }
}

package chap7;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Object> vc = new Vector<Object>(); // Vector vc = new Vector(); 가능
        vc.add("Hello World!");
        vc.add(new Integer(10));
        vc.add(20);
        vc.add(new Student("Kim", 21));
        System.out.println("vector size : = " + vc.size());

        /*for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element " + i + " :" + vc.get(i));
        }*/

        Iterator<Object> it = vc.iterator(); // Iterator it = vc.iterator(); // 가능
        int i = 0;
        while (it.hasNext()) {
            System.out.println("vector element " + i++ + " :" + it.next());
        }
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + '\t' + " age = " + age;
    }
}

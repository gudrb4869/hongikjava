package chap4;

class Employee {
    private String name;
    private double salary;
    private static int count;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    public void finalize() {
        count--;
    }

    public static int getCount() {
        return count;
    }
}

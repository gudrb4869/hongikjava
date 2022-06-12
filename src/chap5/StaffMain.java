package chap5;

class Person {
    private String name;
    private long number;

    public Person(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("이름: " + name + " 주민번호: " + number);
    }
}

class Faculty extends Person {
    private String univ;
    private long number;

    public Faculty(String name, long sNumber, String univ, long number) {
        super(name, sNumber);
        this.univ = univ;
        this.number = number;
    }

    public long getSNumber() {
        return super.getNumber();
    }

    public String getUniv() {
        return univ;
    }

    @Override
    public long getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("이름: " + super.getName() + " 주민번호: " + super.getNumber() +
                " 대학: " + univ + " 직원번호: " + number);
    }
}

class Staff extends Faculty {
    private String division;

    public Staff(String name, long sNumber, String univ, long number, String division) {
        super(name, sNumber, univ, number);
        this.division = division;
    }

    public void printInfo() {
        System.out.println("이름: " + super.getName() + " 주민번호: " + super.getSNumber() +
                " 대학: " + super.getUniv() + " 직원번호: " + super.getNumber() + " 부서: " + division);
    }
}

public class StaffMain {
    public static void main(String[] args) {
        Person she = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
        she.printInfo();
        Faculty i = new Faculty("김영태", 1145782, "연한대학교", 38764);
        i.printInfo();
        Staff he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
        he.printInfo();
    }
}

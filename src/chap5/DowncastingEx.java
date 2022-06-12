package chap5;

public class DowncastingEx {
    public static void main(String[] args) {
        Person2 p = new Student("이재문"); // 업캐스팅 발생
        Student s;
        
        s = (Student) p; // 다운캐스팅

        System.out.println(s.name); // 오류 없음
        s.grade = "A"; // 오류 없음
    }
}

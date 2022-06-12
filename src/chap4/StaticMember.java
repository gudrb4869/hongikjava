package chap4;

class CurrentcyConverter {
    private static double rate;
    public static double toDollar(double won) {
        return won/rate;
    }
    public static double toKWR(double dollar) {
        return dollar * rate;
    }
    public static void setRate(double r) {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        CurrentcyConverter.setRate(1121);
        System.out.println("백만원은 " + CurrentcyConverter.toDollar(1000000) + "달러입니다.");
        System.out.println("백달러은 " + CurrentcyConverter.toKWR(100) + "원입니다.");
    }
}

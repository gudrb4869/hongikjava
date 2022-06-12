package chap4;

class StaticUse1 {
    private String year, name;
    private double don;
    private static double iyul;

    public StaticUse1(String name, double don, String year) {
        this.name = name;
        this.don = don;
        this.year = year;
    }

    public static void changeIyul(double d) {
        iyul = d;
    }

    public void disp() {
        System.out.println("예금주:" + name + " 입금금액:" + don + " "
                + year + "년 이율:" + iyul + " 이자:" + don*iyul);
    }
}

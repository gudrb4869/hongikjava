package chap4;

public class StaticUse {
    public static void main(String[] args) {
        StaticUse1.changeIyul(0.05);
        StaticUse1 es1 = new StaticUse1("김말자", 10000.0, "1994");
        es1.disp();
        StaticUse1 es2 = new StaticUse1("주만만", 20000.0, "2000");
        es2.disp();
        StaticUse1 es3 = new StaticUse1("이수정", 30000.0, "2013");
        es3.disp();
        StaticUse1.changeIyul(0.01);
        es1.disp();
        es2.disp();
        es3.disp();
    }
}

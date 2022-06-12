package chap4;

public class StaticValue {
    static int staticVal = 0;
    String name;

    public StaticValue(String name) {
        staticVal++;
        this.name = name;
        System.out.println("객체생성 : " + staticVal + " 이름 :" + name);
    }

    public static void main(String[] args) {
        StaticValue st1 = new StaticValue("method 01");
        StaticValue st2 = new StaticValue("method 02");
        StaticValue st3 = new StaticValue("method 03");
    }
}

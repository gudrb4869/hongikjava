package chap4;

public class GoodStock {
    String goodsCode;
    Integer stockNum;

    void addStock(Integer num) {
        stockNum += num;
    }

    public static void main(String[] args) {
        GoodStock obj;
        obj = new GoodStock();
        obj.goodsCode = "52135";
        obj.stockNum = 200;
        System.out.println("상품코드:" + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
        obj.addStock(1000);
        System.out.println("상품코드:" + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
    }
}

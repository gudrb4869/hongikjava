package chap6;

class Complex {
    private double real, iamg;

    public Complex(double real, double imag) {
        this.real = real;
        this.iamg = imag;
    }

    @Override
    public String toString() {
        return real + " + " + iamg + "i";
    }
}

public class ComplexEx {
    public static void main(String[] args) {
        Object complex01 = new Complex(4.5, 8.2);
        Complex complex02 = new Complex(7.2, 9.9);
        System.out.println("complex01 = " + complex01.toString());
        System.out.println("complex02 = " + complex02);
    }
}

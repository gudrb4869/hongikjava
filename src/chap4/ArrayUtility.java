package chap4;

class Array {
    static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (double) source[i];
        }
        return result;
    }
    static int[] doubleToInt(double[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (int) source[i];
        }
        return result;
    }
}

public class ArrayUtility {
    public static void main(String[] args) {
        int i[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double d[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};

        System.out.print("정수를 : ");
        for (int i1 : i) {
            System.out.print("\t" + i1);
        }
        System.out.print("\n실수로 : ");
        for(double d1 : Array.intToDouble(i)) {
            System.out.print("\t" + d1);
        }

        System.out.print("\n\n실수를 : ");
        for (double d1 : d) {
            System.out.print("\t" + d1);
        }
        System.out.print("\n정수로 : ");
        for(int i1 : Array.doubleToInt(d)) {
            System.out.print("\t" + i1);
        }
    }
}

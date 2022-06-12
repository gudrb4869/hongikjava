package chap6;

import java.util.StringTokenizer;

public class StringTokenizerHW {
    public static void main(String[] args) {
        String str = "name=Hongik Univ&address=ROK Seoul&division=Computer Eng";
        StringTokenizer st = new StringTokenizer(str, "&");
        while (st.hasMoreTokens()) {
            printToken(new StringTokenizer(st.nextToken(), "="));
        }
    }

    public static void printToken(StringTokenizer st) {
        System.out.print("token number = " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.print("\t" + st.nextToken());
        }
        System.out.println();
    }
}

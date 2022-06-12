package chap6;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) { //기본 분리자" \t\n\r\f"
        String str = "public static void main(String[] args) {";
        StringTokenizer st1 = new StringTokenizer(str);
        printToken(st1);
        StringTokenizer st2 = new StringTokenizer(str, " ()");
        printToken(st2);
        StringTokenizer st3 = new StringTokenizer(str, " ()[]{");
        printToken(st3);
    }

    public static void printToken(StringTokenizer st) {
        System.out.println("토큰 수: " + st.countTokens());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            System.out.print(++cnt + ". " + st.nextToken() + " ");
        }
        System.out.println();
    }
}

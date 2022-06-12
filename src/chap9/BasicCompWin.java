package chap9;

import javax.swing.*;
import java.awt.*;

public class BasicCompWin extends JFrame {
    public BasicCompWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);

        JLabel lb = new JLabel("레이블의 글자");
        lb.setForeground(Color.BLUE); // 색상 수정
        lb.setHorizontalAlignment(SwingConstants.CENTER); // 가로정렬 수정
        add(lb);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BasicCompWin("레이블 알아보기");
    }
}

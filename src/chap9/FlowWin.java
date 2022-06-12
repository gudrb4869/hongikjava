package chap9;

import javax.swing.*;
import java.awt.*;

public class FlowWin extends JFrame {
    public FlowWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
        add(new JButton("버튼 1"));
        add(new JButton("버튼 2"));
        add(new JButton("버튼 3"));
        add(new JButton("버튼 4"));
        add(new JButton("버튼 5"));
        setVisible(true);
    }
    public static void main(String[] args) {
        FlowWin win = new FlowWin("FlowLayout 윈도우");
    }
}

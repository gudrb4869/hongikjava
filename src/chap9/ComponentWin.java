package chap9;

import javax.swing.*;
import java.awt.*;

public class ComponentWin extends JFrame {
    Container pane = getContentPane();
    public ComponentWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Container pane = getContentPane();
        pane.setBackground(Color.pink);
        setSize(300, 150);
        setVisible(true);
    }

    void addButton() {
//        add(new JButton("첫 버튼"));
        pane.setLayout(new FlowLayout());
        pane.add(new JButton("버튼 1"));
        pane.add(new JButton("버튼 2"));
        pane.add(new JButton("버튼 3"));
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ComponentWin f = new ComponentWin("첫 버튼 프로그램");
        try {
            Thread.sleep(2000); // 2초 기다리기
        } catch (InterruptedException e) {}
        f.addButton();
    }
}

package chap9;

import javax.swing.*;
import java.awt.*;

// 1
/*public class MyColorFrame extends JFrame {
    public MyColorFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.MAGENTA);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyColorFrame f = new MyColorFrame("프레임프로그램");
        try {
            Thread.sleep(2000); // 2초 기다리기
        } catch (InterruptedException e) {}
        f.decorate();
    }
}*/

// 2 JPanel을 사용하여 재작성
public class MyColorFrame extends JFrame {
    JPanel pane = new JPanel();
    public MyColorFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public void decorate() {
        pane.setBackground(Color.MAGENTA);
        add(pane);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyColorFrame f = new MyColorFrame("프레임프로그램");
        try {
            Thread.sleep(2000); // 2초 기다리기
        } catch (InterruptedException e) {}
        f.decorate();
    }
}
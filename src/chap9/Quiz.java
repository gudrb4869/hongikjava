package chap9;

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    public Quiz(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makePanel();
        setSize(300, 100);
        setVisible(true);
    }

    public void makePanel() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBackground(Color.RED);
        p2.setBackground(Color.YELLOW);

        // 1
        /*JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        p.add(p1);
        p.add(p2);
        add(p);*/

        // 2
        /*Container c = getContentPane();
        c.setLayout(new GridLayout(1, 2));
        c.add(p1);
        c.add(p2);*/

        // 3
        setLayout(new GridLayout(1, 2));
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        new Quiz("패널 알아보기");
    }
}

package chap9;

import javax.swing.*;
import java.awt.*;

public class PanelWin extends JFrame {
    PanelWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        makePanel();
        setVisible(true);
    }

    void makePanel() {
        JPanel pan1 = new JPanel();
        pan1.setBackground(Color.RED);
        JPanel pan2 = new JPanel();
        pan2.setBackground(Color.YELLOW);
        // 1
        /*JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        p.add(pan1);
        p.add(pan2);
        add(p);*/

        // 2
        /*Container c = getContentPane();
        c.setLayout(new GridLayout(1, 2));
        c.add(pan1);
        c.add(pan2);*/

        // 3
        setLayout(new GridLayout(1, 2));
        add(pan1);
        add(pan2);
    }

    public static void main(String[] args) {
        new PanelWin("패널 알아보기");
    }
}

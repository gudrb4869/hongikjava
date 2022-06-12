package chap9;

import javax.swing.*;
import java.awt.*;

public class CalculatorWin extends JFrame {
    public CalculatorWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout(10,5));
        makeNorth();
        makeCenter();
        setVisible(true);
    }

    public void makeNorth() {
        add(new TextField(), BorderLayout.NORTH);
    }

    public void makeCenter() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4, 8, 3));
        p.add(new JButton("7")); p.add(new JButton("8")); p.add(new JButton("9")); p.add(new JButton("+"));
        p.add(new JButton("4")); p.add(new JButton("5")); p.add(new JButton("6")); p.add(new JButton("-"));
        p.add(new JButton("1")); p.add(new JButton("2")); p.add(new JButton("3")); p.add(new JButton("*"));
        p.add(new JButton("0")); p.add(new JButton(".")); p.add(new JButton("=")); p.add(new JButton("/"));
        add(p, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new CalculatorWin("계산기");
    }
}

package chap9;

import javax.swing.*;
import java.awt.*;

// 1
/*public class GridLayoutEx extends JFrame {
    GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        *//*GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        c.setLayout(grid);*//*
        c.setLayout(new GridLayout(4, 2, 0, 5));
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}*/

// 2
public class GridLayoutEx extends JFrame {
    GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        decorate();
        setSize(300, 200);
        setVisible(true);
    }

    public void decorate() {
        setLayout(new GridLayout(4, 2, 0, 5));
        add(new JLabel(" 이름"));
        add(new JTextField(""));
        add(new JLabel(" 학번"));
        add(new JTextField(""));
        add(new JLabel(" 학과"));
        add(new JTextField(""));
        add(new JLabel(" 과목"));
        add(new JTextField(""));

    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}

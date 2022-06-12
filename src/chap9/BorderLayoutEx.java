package chap9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    BorderLayoutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 1
        /*c.setLayout(new BorderLayout());
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);
        c.add(new JButton("Calculate"), BorderLayout.CENTER);*/

        // 2
        /*setLayout(new BorderLayout());
        add(new JButton("add"), BorderLayout.NORTH);
        add(new JButton("sub"), BorderLayout.SOUTH);
        add(new JButton("mul"), BorderLayout.EAST);
        add(new JButton("div"), BorderLayout.WEST);
        add(new JButton("Calculate"), BorderLayout.CENTER);*/

        // 3
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("add"), BorderLayout.NORTH);
        panel.add(new JButton("sub"), BorderLayout.SOUTH);
        panel.add(new JButton("mul"), BorderLayout.EAST);
        panel.add(new JButton("div"), BorderLayout.WEST);
        panel.add(new JButton("Calculate"), BorderLayout.CENTER);
        add(panel);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}

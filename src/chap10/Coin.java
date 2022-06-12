package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Coin extends JFrame {
    Coin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1, 10, 5));
        decorate();
        setSize(300, 150);
        setVisible(true);
    }

    public void decorate() {
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JButton button = new JButton("던지기");
        JLabel front = new JLabel("0");
        JLabel back = new JLabel("0");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = (int) (Math.random() * 2);
                if (x == 0) {
                    int i = Integer.parseInt(front.getText());
                    i++;
                    front.setText(Integer.toString(i));
                } else {
                    int i = Integer.parseInt(back.getText());
                    i++;
                    back.setText(Integer.toString(i));
                }
            }
        });
        pan1.add(button);
        add(pan1);
        pan2.add(front);
        pan2.add(back);
        add(pan2);
    }

    public static void main(String[] args) {
        new Coin("동전던지기");
    }
}

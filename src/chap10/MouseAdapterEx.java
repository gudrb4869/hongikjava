package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterEx extends JFrame {
    JPanel pan = new JPanel();
    JLabel la;

    MouseAdapterEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pan);
        pan.setLayout(null);
        pan.addMouseListener(new MyMouseAdapter());
        la = new JLabel("hello");
        la.setSize(50, 20);
        la.setLocation(30, 30);
        pan.add(la);
        setSize(200, 200);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }
}

package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickAndDoubleClickEx extends JFrame {
    JPanel contentPane = new JPanel();
    ClickAndDoubleClickEx() {
        setTitle("Click and DoubleClick 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.addMouseListener(new MyMouseListener());
        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);

                /*JPanel p = (JPanel) e.getSource();
                p.setBackground(new Color(r,b,g));*/
                contentPane.setBackground(new Color(r,b,g));
            }
        }
    }

    public static void main(String[] args) {
        new ClickAndDoubleClickEx();
    }
}

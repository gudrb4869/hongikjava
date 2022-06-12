package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseDraggingFrame extends JFrame {
    Container c = getContentPane(); // 2
    public MouseDraggingFrame() {
        super("드래깅동안 YELLOW로 변경");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Container c = getContentPane(); // 1 */c.setBackground(Color.GREEN);
        MyMouseListener ml = new MyMouseListener();
        c.addMouseMotionListener(ml);
        c.addMouseListener(ml);
        setSize(250, 200); setVisible(true);
    }

    class MyMouseListener extends MouseAdapter implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
//            Container c = (Container) e.getSource(); // 1
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseMoved(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {
//            Container c = (Container) e.getSource(); // 1
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new MouseDraggingFrame();
    }
}

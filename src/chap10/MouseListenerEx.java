package chap10;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 1
/*
public class MouseListenerEx extends JFrame {
    JPanel pan = new JPanel();
    JLabel la = new JLabel("hello");
    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeLabelList();
        add(pan);
        setSize(200, 200);
        setVisible(true);
    }

    void makeLabelList() {
        pan.setLayout(null);
        pan.addMouseListener(new MyMouseListener());
        la.setSize(50, 20);
        la.setLocation(30, 30);
        pan.add(la);
    }

    class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
*/

// 2 MouseListener 인터페이스를 상속받아 클래스로 재구현
/*public class MouseListenerEx extends JFrame implements MouseListener{
    JPanel pan = new JPanel();
    JLabel la = new JLabel("hello");
    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeLabelList();
        add(pan);
        setSize(200, 200);
        setVisible(true);
    }

    void makeLabelList() {
        pan.setLayout(null);
        pan.addMouseListener(this);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        pan.add(la);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        la.setLocation(x, y);
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}*/

// 3 독립 클래스로 재구현
public class MouseListenerEx extends JFrame {
    JPanel pan = new JPanel();
    JLabel la = new JLabel("hello");
    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeLabelList();
        add(pan);
        setSize(200, 200);
        setVisible(true);
    }

    void makeLabelList() {
        pan.setLayout(null);
        pan.addMouseListener(new MyMouseListener2(la));
        la.setSize(50, 20);
        la.setLocation(30, 30);
        pan.add(la);
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}

class MyMouseListener2 implements MouseListener {
    JLabel la;
    public MyMouseListener2(JLabel la) {
        this.la = la;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        la.setLocation(x, y);
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
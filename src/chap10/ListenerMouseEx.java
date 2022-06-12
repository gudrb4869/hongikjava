package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenerMouseEx extends JFrame {
    ListenerMouseEx() {
        setTitle("버튼에 Mouse 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btn = new JButton("Mouse Event 테스트 버튼");
        btn.setBackground(Color.YELLOW);
        MyMouseListener listener = new MyMouseListener();
        btn.addMouseListener(listener);
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListenerMouseEx();
    }
}

class MyMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setBackground(Color.RED);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setBackground(Color.YELLOW);
    }
}

package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel();

    KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane); // add(contentPane); 과 같음
        contentPane.addKeyListener(new MyKeyListener());
        contentPane.add(la);
        setSize(300, 150);
        setVisible(true);
        contentPane.setFocusable(true);
        contentPane.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()) + "입력되었습니다.");
            if (e.getKeyChar() == '%')
                contentPane.setBackground(Color.YELLOW);
            else if(e.getKeyCode() == KeyEvent.VK_F1)
                contentPane.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}

/*// 익명클래스로 재작성
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyCodeEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel();

    KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        add(contentPane);
        setContentPane(contentPane);
        contentPane.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                la.setText(e.getKeyText(e.getKeyCode()) + "입력되었습니다.");
                if (e.getKeyChar() == '%')
                    contentPane.setBackground(Color.YELLOW);
                else if(e.getKeyCode() == KeyEvent.VK_F1)
                    contentPane.setBackground(Color.GREEN);
            }

            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        contentPane.add(la);
        setSize(300, 150);
        setVisible(true);
        contentPane.requestFocus();
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}*/

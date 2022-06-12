package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Hw10 extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel[] label = new JLabel[3];
    JLabel message;
    Hw10 () {
        setTitle("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeKeyDisplay();
        setSize(300, 200);
        setVisible(true);
        contentPane.setFocusable(true);
        contentPane.requestFocus();
    }

    void makeKeyDisplay() {
        contentPane.addKeyListener(new MyKeyListener());
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel("0"); // 레이블 생성
            label[i].setSize(60, 30); // 레이블 크기
            label[i].setLocation(30 + 80 * i, 50); // 레이블 위치
            label[i].setHorizontalAlignment(JLabel.CENTER); //레이블 센터링
            label[i].setOpaque(true); // 배경색 설정
            label[i].setBackground(Color.MAGENTA);//배경색 설정
            label[i].setForeground(Color.YELLOW); //글자 색 설정
            label[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
            add(label[i]); // 레이블을 부착한다.
        }
        message = new JLabel("시작합니다");
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(100, 100, 80, 30);
        add(message);
        add(contentPane);
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == '\n') {
                for (int i = 0; i < label.length; i++) {
                    int x = (int) (Math.random() * 5);
                    label[i].setText(Integer.toString(x));
                }
                if (label[0].getText().equals(label[1].getText()) && label[1].getText().equals(label[2].getText())) {
                    message.setText("축하합니다!!");
                } else {
                    message.setText("아쉽군요");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Hw10();
    }
}

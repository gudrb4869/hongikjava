package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    JButton btn; // 2
    InnerClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }

    // 1
    /*private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
                b.setBackground(Color.YELLOW);
            }
            else {
                b.setText("Action");
                b.setBackground(Color.RED);
            }

            setTitle(b.getText());
        }
    }*/

    // 2 JButton btn을 속성으로 사용하여 재작성
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (btn.getText().equals("Action"))
                btn.setText("액션");
            else
                btn.setText("Action");

            setTitle(btn.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }
}

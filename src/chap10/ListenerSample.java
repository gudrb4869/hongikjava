package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerSample extends JFrame {
    ListenerSample() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        MyActionListener listener = new MyActionListener();
        btn.addActionListener(listener);
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListenerSample();
    }
}

// 1
/*class MyActionListener implements ActionListener {
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
    }
}*/

// 2 getActionCommand()와 getSource() 사용
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        String text = b.getActionCommand();
        if (text.equals("Action")) {
            b.setText("액션");
            b.setBackground(Color.YELLOW);
        }
        else {
            b.setText("Action");
            b.setBackground(Color.RED);
        }
    }
}

package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        MyActionListener2 listener = new MyActionListener2(btn);
        btn.addActionListener(listener);
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

// 1 독립 클래스로 리스너 작성
class MyActionListener2 implements ActionListener {
    JButton btn;
    public MyActionListener2(JButton btn) {
        this.btn = btn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (btn.getText().equals("Action"))
            btn.setText("액션");
        else
            btn.setText("Action");
    }
}

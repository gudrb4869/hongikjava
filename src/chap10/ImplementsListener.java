package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementsListener extends JFrame implements ActionListener {
    ImplementsListener() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(this);
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else
            b.setText("Action");
        setTitle(b.getText());
    }

    public static void main(String[] args) {
        new ImplementsListener();
    }
}

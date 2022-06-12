package chap9;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class TextFieldWin extends JFrame {
    public TextFieldWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 240);
        makeTextField();
        setVisible(true);
    }

    public void makeTextField() {
        JPanel pL = new JPanel();
        pL.setLayout(new GridLayout(0, 1, 20, 5));
        pL.add(new JLabel("  이름  "));
        pL.add(new JLabel("  암호  "));
        pL.add(new JLabel("  생일  "));
        JPanel pR = new JPanel();
        pR.setLayout(new GridLayout(0, 1, 20, 5));
        pR.add(new JTextField("홍길동"));
        JPasswordField pwd = new JPasswordField();
        pwd.setEchoChar('#');
        pR.add(pwd);
        JFormattedTextField date = new JFormattedTextField();
        date.setValue(new Date());
        pR.add(date);
        JPanel pD = new JPanel();
        pD.add(new JLabel("  메모  "));
        pD.add(new JTextArea(5, 30));
        add(pL, "West");
        add(pR, "Center");
        add(pD, "South");
    }

    public static void main(String[] args) {
        new TextFieldWin("텍스트필드 알아보기");
    }
}

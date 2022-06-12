package chap10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1
/*public class RadioButtonWin extends JFrame implements ActionListener {
    JPanel pRadio = new JPanel();
    public RadioButtonWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        makeRadioButton();
        add(pRadio);
        setVisible(true);
    }

    public void makeRadioButton() {
        JRadioButton r1 = new JRadioButton("남자");
        r1.addActionListener(this);
        JRadioButton r2 = new JRadioButton("여자", true);
        r2.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        pRadio.add(r1);
        pRadio.add(r2);
    }

    public static void main(String[] args) {
        new RadioButtonWin("라디오버튼 이벤트");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setTitle(e.getActionCommand());
    }
}*/

// 2 MyActionListener를 내부 클래스로 재작성
public class RadioButtonWin extends JFrame {
    JPanel pRadio = new JPanel();
    public RadioButtonWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        makeRadioButton();
        add(pRadio);
        setVisible(true);
    }

    public void makeRadioButton() {
        MyActionListener listener = new MyActionListener();
        JRadioButton r1 = new JRadioButton("남자");
        r1.addActionListener(listener);
        JRadioButton r2 = new JRadioButton("여자", true);
        r2.addActionListener(listener);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        pRadio.add(r1);
        pRadio.add(r2);
    }

    public static void main(String[] args) {
        new RadioButtonWin("라디오버튼 이벤트");
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle(e.getActionCommand());
        }
    }
}
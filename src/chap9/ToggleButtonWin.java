package chap9;

import javax.swing.*;
import java.awt.*;

public class ToggleButtonWin extends JFrame {
    private JPanel panCheck = new JPanel();
    private JPanel panRadio = new JPanel();
    ToggleButtonWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        makeCheckBox();
        makeRadioBox();
        setLayout(new GridLayout(0, 1));
        add(panCheck);
        add(panRadio);
        setVisible(true);
    }

    void makeCheckBox() {
        panCheck.setBackground(Color.MAGENTA);
        panCheck.add(new JCheckBox("수영", true));
        panCheck.add(new JCheckBox("농구"));
        panCheck.add(new JCheckBox("골프"));
        panCheck.add(new JCheckBox("야구"));
    }

    void makeRadioBox() {
        ButtonGroup butGp = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("First Class");
        JRadioButton r2 = new JRadioButton("Business Class");
        JRadioButton r3 = new JRadioButton("Economy Class");
        butGp.add(r1); butGp.add(r2); butGp.add(r3);
        panRadio.setBackground(Color.pink);
        panRadio.add(r1); panRadio.add(r2); panRadio.add(r3);
    }

    public static void main(String[] args) {
        new ToggleButtonWin("토글버튼");
    }
}

package chap9;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    JFrame f = new JFrame();
    public MyFrame(String title) {
        f.setTitle(title);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        decorate();
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void decorate() {
        Container pane = f.getContentPane();
        pane.setBackground(Color.yellow);
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame("첫번째 프레임");
    }
}

/*
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        decorate();
        setSize(300, 300);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.yellow);
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame("첫번째 프레임");
    }
}
*/

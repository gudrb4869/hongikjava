package chap9;

import javax.swing.*;
import java.awt.*;

// 1
/*public class ContentPaneEx extends JFrame {
    ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        decorate();
        setSize(350, 150);
        setVisible(true);
    }

    void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.ORANGE);
        pane.setLayout(new FlowLayout());
        pane.add(new JButton("OK"));
        pane.add(new JButton("Cancel"));
        pane.add(new JButton("Ignore"));
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}*/


// 2
/*public class ContentPaneEx extends JFrame {
    ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        decorate();
        setSize(350, 150);
        setVisible(true);
    }

    void decorate() {
        JPanel pane = new JPanel();
        pane.setBackground(Color.ORANGE);
        pane.setLayout(new FlowLayout());
        pane.add(new JButton("OK"));
        pane.add(new JButton("Cancel"));
        pane.add(new JButton("Ignore"));
        add(pane);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}*/

// 3
public class ContentPaneEx extends JFrame {
    JPanel pane = new JPanel();
    ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        decorate();
        add(pane);
        setSize(350, 150);
        setVisible(true);
    }

    void decorate() {
        pane.setBackground(Color.ORANGE);
        pane.setLayout(new FlowLayout());
        pane.add(new JButton("OK"));
        pane.add(new JButton("Cancel"));
        pane.add(new JButton("Ignore"));
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
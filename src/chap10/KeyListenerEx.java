package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel[] keyMessage;
    public KeyListenerEx() {
        setTitle("KeyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeKeyDisplay();
        setSize(300, 150);
        setVisible(true);
        contentPane.setFocusable(true);
        contentPane.requestFocus();
    }

    void makeKeyDisplay() {
        contentPane.addKeyListener(new MyKeyListener());
        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel("  getKeyCode()  ");
        keyMessage[1] = new JLabel("  getKeyChar()  ");
        keyMessage[2] = new JLabel("  getKeyText()  ");
        for (int i = 0; i < keyMessage.length; i++) {
            contentPane.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.CYAN);
        }
        add(contentPane);
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}

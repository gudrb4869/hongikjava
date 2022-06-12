package chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame implements ActionListener {
    public MenuActionEventEx(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle(title);
        makeMenuAndEventHandle();
        setVisible(true);
    }

    public void makeMenuAndEventHandle() {
        JMenuBar mBar = new JMenuBar();
        JMenu mainMenu = new JMenu("주메뉴");
        JMenu subMenu = new JMenu("바탕색상");
        JMenuItem subMItem = null;
        String[] menuItemName = {"노랑", "빨강", "회색"};
        for (int i = 0; i < menuItemName.length; i++) {
            subMItem = new JMenuItem(menuItemName[i]);
            subMenu.add(subMItem);
            subMItem.addActionListener(this);
        }
        mainMenu.add(subMenu);
        mBar.add(mainMenu);
        setJMenuBar(mBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strCmd = e.getActionCommand();
        Container pane = getContentPane();
        if (strCmd.equals("빨강"))
            pane.setBackground(Color.red);
        else if (strCmd.equals("노랑"))
            pane.setBackground(Color.yellow);
        else if (strCmd.equals("회색"))
            pane.setBackground(Color.gray);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MenuActionEventEx("메뉴 처리");
    }
}
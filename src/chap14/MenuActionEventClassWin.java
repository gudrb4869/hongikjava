package chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
public class MenuActionEventClassWin extends JFrame {
    JMenuItem subMItem; JMenuBar mBar; JMenu mainMenu, subMenu;
    public MenuActionEventClassWin(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle(title);
        makeMenuAndEventHandle();
        setVisible(true);
    }

    public void makeMenuAndEventHandle() {
        mBar = new JMenuBar();
        mainMenu = new JMenu("주메뉴");
        subMenu = new JMenu("바탕색상");
        subMItem = null;
        String[] menuItemName = {"노랑", "빨강", "회색"};
        for (int i = 0; i < menuItemName.length; i++) {
            subMItem = new JMenuItem(menuItemName[i]);
            subMenu.add(subMItem);
            MyActionListener my = new MyActionListener(this*/
/*, subMItem*//*
);
            subMItem.addActionListener(my);
        }
        mainMenu.add(subMenu);
        mBar.add(mainMenu);
        setJMenuBar(mBar);
    }

    public static void main(String[] args) {
        MenuActionEventClassWin myWin = new MenuActionEventClassWin("메뉴 처리");
    }
}

class MyActionListener implements ActionListener{
    JFrame frame;

    public MyActionListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strCmd = e.getActionCommand();
        Container pane = frame.getContentPane();
        if (strCmd.equals("빨강"))
            pane.setBackground(Color.red);
        else if (strCmd.equals("노랑"))
            pane.setBackground(Color.yellow);
        else if (strCmd.equals("회색"))
            pane.setBackground(Color.gray);
    }
}*/

public class MenuActionEventClassWin extends JFrame implements ActionListener {
    JMenuItem subMItem; JMenuBar mBar; JMenu mainMenu, subMenu;
    public MenuActionEventClassWin(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle(title);
        makeMenuAndEventHandle();
        setVisible(true);
    }

    public void makeMenuAndEventHandle() {
        mBar = new JMenuBar();
        mainMenu = new JMenu("주메뉴");
        subMenu = new JMenu("바탕색상");
        subMItem = null;
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

    public static void main(String[] args) {
        MenuActionEventClassWin myWin = new MenuActionEventClassWin("메뉴 처리");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container pane = getContentPane();
        String strCmd = e.getActionCommand();
        if (strCmd.equals("빨강"))
            pane.setBackground(Color.red);
        else if (strCmd.equals("노랑"))
            pane.setBackground(Color.yellow);
        else if (strCmd.equals("회색"))
            pane.setBackground(Color.gray);
    }
}
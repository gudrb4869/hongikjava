package chap9;

import javax.swing.*;
import java.awt.*;

public class ListWin extends JFrame {
    public ListWin(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 400, 250, 60);
        makeComboBox();
        setVisible(true);
    }

    public void makeComboBox() {
        JPanel pan = new JPanel();
        // 패널의 배치과니를 가로로 이등분하기 위해 GridLayout 설정
        pan.setLayout(new GridLayout(1, 2, 5, 5));
        JLabel label = new JLabel(" Galaxy Series : ", JLabel.RIGHT);

        // JComboBox 목록에 입력될 갤럭시 시리즈 이름 문자열
        String ph[] = {"Galaxy S", "Galaxy S2", "Galaxy Note", "Galaxy S3"};
        JComboBox<String> comboBox = new JComboBox<String>(ph);
        // JComboBox 목록에 일일이 항목을 삽입하는 방법
        comboBox.addItem("Galaxy Note2");
        // JComboBox 필드를 편집 가능하도록 하는 방법
        comboBox.setEditable(true);
        // JComboBox 목록 통해서 4번째 항목을 선택하는 방법
        comboBox.setSelectedIndex(3);
        pan.add(label);
        pan.add(comboBox);
        add(pan);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ListWin("목록 선택을 위한 콤보박스");
    }
}

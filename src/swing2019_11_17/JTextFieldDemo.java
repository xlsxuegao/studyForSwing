package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java文本框组件示例");
        JPanel jPanel = new JPanel();
        JTextField text1 = new JTextField();
        text1.setText("普通文本框");
        JTextField text2 = new JTextField(28);
        text2.setFont(new Font("楷体",Font.BOLD,16));
        text2.setText("指定长度和字体的文本框");
        JTextField text3 = new JTextField(30);
        text3.setText("居中对齐");
        text3.setHorizontalAlignment(JTextField.CENTER);
        jPanel.add(text1);
        jPanel.add(text2);
        jPanel.add(text3);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

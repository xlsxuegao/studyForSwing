package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java复选组件示例");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("流行的编程语言有：");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));
        //创建指定文本和状态的复选框
        JCheckBox checkBox1 = new JCheckBox("C#",true);
        JCheckBox checkBox2 = new JCheckBox("C++");
        JCheckBox checkBox3 = new JCheckBox("Java");
        JCheckBox checkBox4 = new JCheckBox("Python");
        JCheckBox checkBox5 = new JCheckBox("PHP");
        JCheckBox checkBox6 = new JCheckBox("Per1");
        jPanel.add(jLabel);
        jPanel.add(checkBox1);
        jPanel.add(checkBox2);
        jPanel.add(checkBox3);
        jPanel.add(checkBox4);
        jPanel.add(checkBox5);
        jPanel.add(checkBox6);
        frame.add(jPanel);
        frame.setBounds(300,200,400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

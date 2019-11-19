package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java单选组件示例");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("现在是哪个季节：");
        JRadioButton rb1 = new JRadioButton("春天");
        JRadioButton rb2 = new JRadioButton("夏天");
        JRadioButton rb3 = new JRadioButton("秋天");
        JRadioButton rb4 = new JRadioButton("冬天");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));
        ButtonGroup group = new ButtonGroup();
        //添加JRadioButton到ButtonGroup中
        group.add(rb1);
        group.add(rb2);
//        group.add(rb3);
//        group.add(rb4);
        jPanel.add(jLabel);
        jPanel.add(rb1);
        jPanel.add(rb2);
        jPanel.add(rb3);
        jPanel.add(rb4);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo {
    public static void main(String[] args) {
        //创建JFrame窗口
        JFrame jFrame = new JFrame("Java按钮组件示例");
        jFrame.setSize(400,200);
        //创建JPanel对象
        JPanel jPanel = new JPanel();
        //创建JButton对象
        JButton btn1 = new JButton("我是普通按钮");
        JButton btn2 = new JButton("我是带背景颜色按钮");
        JButton btn3 = new JButton("我是不可用按钮");
        JButton btn4 = new JButton("我是底部对齐按钮");
        jPanel.add(btn1);
        //设置按钮2 的背景颜色
        btn2.setBackground(Color.pink);
        jPanel.add(btn2);
        //设置按钮3不可用
        btn3.setEnabled(false);
        jPanel.add(btn3);
        //设置尺寸
        Dimension dimension = new Dimension(160, 60);
        //设置按钮4大小
        btn4.setPreferredSize(dimension);
        //设置对齐方式  垂直对齐
        btn4.setVerticalAlignment(SwingConstants.BOTTOM);
        jPanel.add(btn4);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,600,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

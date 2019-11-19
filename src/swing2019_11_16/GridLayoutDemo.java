package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        //创建JFrame
        JFrame jFrame = new JFrame("GridLayout布局计算器");
        //创建面板
        JPanel panel = new JPanel();
        //指定面板的布局为GridLayout,4行4列，间隙为5
        panel.setLayout(new GridLayout(4,4,5,5));
        //添加按钮
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        //添加面板到容器
        jFrame.add(panel);
        jFrame.setBounds(300,200,200,150);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

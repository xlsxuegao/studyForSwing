package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        //创建JFrame对象
        JFrame jFrame = new JFrame("Java第二个GUI程序");
        //设置窗口是否可以关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小和位置
        jFrame.setBounds(300,100,400,200);
        //创建一个JPanel对象
        JPanel jPanel = new JPanel();
        //创建一个标签
        JLabel jLabel = new JLabel("这是放在JPanel上的标签");
        //设置背景颜色
        jPanel.setBackground(Color.white);
        //将标签添加到面板
        jPanel.add(jLabel);
        //将面板添加到窗口
        jFrame.add(jPanel);
        //设置窗口可见性
        jFrame.setVisible(true);
    }
}

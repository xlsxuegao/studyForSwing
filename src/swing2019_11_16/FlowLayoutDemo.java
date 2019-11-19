package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        //创建JFrame窗口
        JFrame jFrame = new JFrame("Java第四个GUI程序");
        //创建面板
        JPanel jPanel = new JPanel();
        //创建按钮
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        //面板中添加按钮
        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);
        jPanel.add(btn6);
        jPanel.add(btn7);
        jPanel.add(btn8);
        jPanel.add(btn9);
        //向JPanel中添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        //设置背景颜色
        jPanel.setBackground(Color.pink);
        //将面板添加到容器中
        jFrame.add(jPanel);
        //设置容器的大小
        jFrame.setBounds(300,200,300,150);
        //设置是否可见
        jFrame.setVisible(true);
        //设置窗口是否能够关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

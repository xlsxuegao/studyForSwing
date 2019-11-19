package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        //创建Frame窗口
        JFrame jFrame = new JFrame("Java第三个GUI程序");
        //设置窗口大小
//        jFrame.setSize(400,200);
        //为Frame窗口设置布局BorderLayout
        jFrame.setLayout(new BorderLayout());
        //创建按钮组件
        JButton button1 = new JButton("上");
        JButton button2 = new JButton("左");
        JButton button3 = new JButton("中");
        JButton button4 = new JButton("右");
        JButton button5 = new JButton("下");
        jFrame.add(button1,BorderLayout.NORTH);
        jFrame.add(button2,BorderLayout.WEST);
        jFrame.add(button3,BorderLayout.CENTER);
        jFrame.add(button4,BorderLayout.EAST);
        jFrame.add(button5,BorderLayout.SOUTH);
        jFrame.setBounds(300,200,600,300);
        //设置窗口是否可见
        jFrame.setVisible(true);
        //设置窗口是否被关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

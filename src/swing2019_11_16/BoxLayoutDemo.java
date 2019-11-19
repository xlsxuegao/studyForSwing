package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("盒式布局");
        //创建水平Box容器
        Box b1 = Box.createHorizontalBox();
        //创建垂直Box容器
        Box b2 = Box.createVerticalBox();
        //将外层横向Box添加进窗体
        jFrame.add(b1);
        //添加高度为200的垂直框架
        b1.add(Box.createVerticalStrut(200));
        //添加按钮1
        b1.add(new JButton("西"));
        //添加长度为140的水平框架
        b1.add(Box.createHorizontalStrut(140));
        //添加按钮2
        b1.add(new JButton("东"));
        //添加水平组件
        b1.add(Box.createHorizontalGlue());
        //添加嵌套的纵向Box容器
        b1.add(b2);
        //添加宽度为100，高度为20的固定区域
        b2.add(Box.createRigidArea(new Dimension(100,20)));
        b2.add(new JButton("北"));
        b2.add(Box.createVerticalGlue());
        b2.add(new JButton("南"));
        //添加长度为40的垂直框架
        b2.add(Box.createVerticalStrut(40));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100,10,400,200);
        jFrame.setVisible(true);

    }
}

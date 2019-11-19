package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame {
    public JFrameDemo(){
        //设置窗口标题
        setTitle("Java 第一个GUI程序");
        //设置窗口显示尺寸
        setSize(400,200);
        //设置窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个标签
        JLabel jLabel = new JLabel("这是一个JFrame类创建的窗口");
        //获取当前窗口的内容窗格
        Container contentPane = getContentPane();
        //将标签组件添加到内容窗格上
        contentPane.add(jLabel);
        //设置窗口是否可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}

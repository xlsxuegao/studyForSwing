package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JTextArea jTextArea = new JTextArea("请输入内容",7,30);
        //设置文本域中的文本自动换行
        jTextArea.setLineWrap(true);
        //设置组件的背景色
        jTextArea.setForeground(Color.pink);
        //修改字体样式
        jTextArea.setFont(new Font("楷体",Font.BOLD,16));
        jTextArea.setBackground(Color.YELLOW);
        //将文本域放入滚动窗口
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        Dimension size = jTextArea.getPreferredSize();
        jScrollPane.setBounds(100,90,size.width,size.height);
        jPanel.add(jScrollPane);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.LIGHT_GRAY);
        jFrame.setSize(400,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

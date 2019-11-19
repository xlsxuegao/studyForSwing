package swing2019_11_16;

import javax.swing.*;

public class JLabelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java标签组件示例");
        JPanel jPanel = new JPanel();
        JLabel label1=new JLabel("普通标签");
        JLabel label2 = new JLabel();
        label2.setText("调用setTitle()方法");
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\auas\\Pictures\\ppgo.PNG");
        //创建一个既包含文本又含有图标的JLabel对象
        JLabel label3 = new JLabel("开始理财",imageIcon,JLabel.CENTER);
        jPanel.add(label1);
        jPanel.add(label2);
        jPanel.add(label3);
        frame.add(jPanel);
        frame.setBounds(300,200,400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

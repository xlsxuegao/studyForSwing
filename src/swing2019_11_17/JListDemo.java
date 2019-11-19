package swing2019_11_17;

import javax.swing.*;

public class JListDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java列表框组件示例");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("证件类型：");
        String [] items = new String[]{"身份证","驾驶证","军官证"};
        JList list = new JList(items);
        jPanel.add(jLabel);
        jPanel.add(list);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

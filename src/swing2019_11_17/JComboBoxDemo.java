package swing2019_11_17;

import javax.swing.*;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java下拉列表组件示例");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("证件类型：");
        JComboBox com = new JComboBox();
        com.addItem("--请选择--");
        com.addItem("身份证");
        com.addItem("驾驶证");
        com.addItem("军官证");
        jPanel.add(jLabel);
        jPanel.add(com);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

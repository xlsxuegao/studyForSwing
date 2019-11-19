package swing2019_11_17;

import swing2019_11_16.JFrameDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SampeDemo {
    private JPanel jPanel = new JPanel();
    private JComboBox comboBox = new JComboBox();
    private JLabel jLabel = new JLabel("添加新星座：");
    private JLabel showInfo = new JLabel();//用于显示信息
    private JTextField jTextField = new JTextField(16);//用于输入信息
    private JButton jButtonAdd = new JButton("新增");
    private JButton jButtonDel = new JButton("删除");

    public SampeDemo(){
        JFrame jFrame = new JFrame("选择你的星座");
        comboBox.addItem("--请选择--");
        comboBox.addItem("巨蟹座");
        comboBox.addItem("狮子座");
        comboBox.addItem("双鱼座");
        jPanel.add(comboBox);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButtonAdd);
        jPanel.add(jButtonDel);
        jFrame.add(jPanel);
        jButtonAdd.addActionListener(new MyActionListener());
        jButtonDel.addActionListener(new MyActionListener());
        comboBox.addItemListener(new MyItemListener());
        jFrame.setBounds(300,200,600,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class MyItemListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            String str = e.getItem().toString();
            jPanel.add(showInfo);
            showInfo.setText("您选择的星座是："+str);
        }
    }
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            //添加按钮处理
            if (command.equals("新增")){
                if (jTextField.getText().length()!=0){
                    comboBox.addItem(jTextField.getText());
                    jPanel.add(showInfo);
                    showInfo.setText("添加成功，新增了："+jTextField.getText());
                }else {
                    jPanel.add(showInfo);
                    showInfo.setText("请输入要添加的星座");
                }
            }
            if (command.equals("删除")){
                if (comboBox.getSelectedIndex()!=-1){
                    //先获得删除的项的值
                    String strDel = comboBox.getSelectedItem().toString();
                    comboBox.removeItem(strDel);
                    jPanel.add(showInfo);
                    showInfo.setText("删除成功，删除了："+strDel);
                }else{
                    jPanel.add(showInfo);
                    showInfo.setText("请选择要删除的星座");
                }
            }
        }
    }

    public static void main(String[] args) {
        new SampeDemo();
    }
}


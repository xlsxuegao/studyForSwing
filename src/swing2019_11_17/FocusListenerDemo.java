package swing2019_11_17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusListenerDemo extends JFrame {
    JList list;
    JLabel jLabel;
    JButton jButton;
    JTextField jTextField;
    public FocusListenerDemo(){
        setTitle("焦点事件监听器示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        jLabel=new JLabel("  ");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));
        contentPane.add(jLabel,BorderLayout.SOUTH);
        jTextField = new JTextField();
        jTextField.setFont(new Font("楷体",Font.BOLD,16));
        jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //获得焦点时执行此方法
                jLabel.setText("文本框获得焦点，正在输入内容");
            }

            @Override
            public void focusLost(FocusEvent e) {
                //失去焦点时执行此方法
                jLabel.setText("文本框失去焦点，内容输入完成");
            }
        });
        contentPane.add(jTextField);
    }

    public static void main(String[] args) {
        FocusListenerDemo focusListenerDemo = new FocusListenerDemo();
        focusListenerDemo.setVisible(true);
    }
}

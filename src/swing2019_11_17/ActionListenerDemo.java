package swing2019_11_17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends JFrame {
    JLabel jLabel;
    JButton jButton;
    int clicks=0;

    public ActionListenerDemo(){
        setTitle("动作事件监听器示例");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(5,5,5,5));
        jPanel.setLayout(new BorderLayout(0,0));
        setContentPane(jPanel);
        jLabel = new JLabel(" ");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));
        jPanel.add(jLabel,BorderLayout.SOUTH);
        jButton = new JButton("我是普通按钮");
        jButton.setFont(new Font("楷体",Font.BOLD,16));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("按钮被单击了"+(clicks++)+" 次");
            }
        });
        jPanel.add(jButton);
    }

    public static void main(String[] args) {
        ActionListenerDemo actionListenerDemo = new ActionListenerDemo();actionListenerDemo.setVisible(true);
    }
}

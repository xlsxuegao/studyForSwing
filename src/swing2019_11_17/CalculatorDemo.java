package swing2019_11_17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculatorDemo extends JFrame {
    private JPanel contentPane;//内容面板
    private JTextField jTextField;//文本框
    public CalculatorDemo(){
        setTitle("计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,250,200);
        contentPane=new JPanel();//创建内容面板
        contentPane.setBorder(new EmptyBorder(5,5,5,5));//设置面板的边框
        contentPane.setLayout(new BorderLayout(0,0));//设置内容面板为边界布局
        setContentPane(contentPane);
        JPanel panel = new JPanel();//新建面板用于保存文本框
        contentPane.add(panel,BorderLayout.NORTH);//将面板放置在边界布局的北部
        jTextField = new JTextField();
        jTextField.setHorizontalAlignment(SwingConstants.RIGHT);//文本框中的文本使用右对齐
        panel.add(jTextField);
        jTextField.setColumns(18);//设置文本框的列数是18
        JPanel jPanel = new JPanel();  //新建面板用于保存按钮
        contentPane.add(jPanel,BorderLayout.CENTER);//将面板放置在边界布局的中央
        jPanel.setLayout(new GridLayout(4,4,5,5));//面板使用网格4*4布局
        JButton button1 = new JButton("7");
        jPanel.add(button1);
        JButton button2 = new JButton("8");
        jPanel.add(button2);
        JButton button3 = new JButton("9");
        jPanel.add(button3);
        JButton button4 = new JButton("+");
        jPanel.add(button4);
        JButton button5 = new JButton("4");
        jPanel.add(button5);
        JButton button6 = new JButton("5");
        jPanel.add(button6);
        JButton button7 = new JButton("6");
        jPanel.add(button7);
        JButton button8 = new JButton("-");
        jPanel.add(button8);
        JButton button9 = new JButton("1");
        jPanel.add(button9);
        JButton button10 = new JButton("2");
        jPanel.add(button10);
        JButton button11 = new JButton("3");
        jPanel.add(button11);
        JButton button12 = new JButton("*");
        jPanel.add(button12);
        JButton button13 = new JButton("0");
        jPanel.add(button13);
        JButton button14 = new JButton(".");
        jPanel.add(button14);
        JButton button15 = new JButton("=");
        jPanel.add(button15);
        JButton button16 = new JButton("/");
        jPanel.add(button16);
    }

    public static void main(String[] args) {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        calculatorDemo.setVisible(true);
    }
}

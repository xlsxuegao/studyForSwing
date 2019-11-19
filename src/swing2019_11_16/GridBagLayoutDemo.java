package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    public static void makeButton(String title, JFrame jFrame, GridBagLayout gridBagLayout,GridBagConstraints constraints){
        JButton button = new JButton(title);
        gridBagLayout.setConstraints(button,constraints);
        jFrame.add(button);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("拨号盘");
        //创建GridBagLayout布局管理器
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        jFrame.setLayout(gridBagLayout);
        //组件填充显示区域
        constraints.fill=GridBagConstraints.BOTH;
        //恢复默认值
        constraints.weightx=0.0;
        //结束行
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JTextField jTextField = new JTextField("123456789");
        gridBagLayout.setConstraints(jTextField,constraints);
        jFrame.add(jTextField);
        constraints.weightx=0.5;
        constraints.weighty=0.2;
        constraints.gridwidth=1;
        //调用方法，添加按钮组件
        makeButton("7",jFrame,gridBagLayout,constraints);
        makeButton("8",jFrame,gridBagLayout,constraints);
        //结束行
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("9",jFrame,gridBagLayout,constraints);
        //重新设定gridwidth的值
        constraints.gridwidth=1;
        makeButton("4",jFrame,gridBagLayout,constraints);
        makeButton("5",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("6",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=1;
        makeButton("1",jFrame,gridBagLayout,constraints);
        makeButton("2",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("3",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=1;
        makeButton("返回",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("拨号",jFrame,gridBagLayout,constraints);
        constraints.gridwidth=1;
        jFrame.setBounds(400,400,400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package swing2019_11_16;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        //创建JFrame窗口
        JFrame jFrame = new JFrame();
        //面板1
        JPanel p1 = new JPanel();
        //面板2
        JPanel p2 = new JPanel();
        //卡片式布局的面板
        JPanel cards = new JPanel(new CardLayout());
        //创建按钮
        p1.add(new JButton("登录按钮"));
        p1.add(new JButton("注册按钮"));
        p1.add(new JButton("找回密码按钮"));
        p2.add(new JTextField("用户文本框",20));
        p2.add(new JTextField("密码文本框",20));
        p2.add(new JTextField("验证码文本框",20));
        //向卡片式布局中添加面板1
        cards.add(p1,"card1");
        //向卡片式布局中添加面板2
        cards.add(p2,"card2");
        CardLayout c1 =(CardLayout) (cards.getLayout());
        //show()方法第二个参数表示显示的面板
        c1.show(cards,"card2");
        jFrame.add(cards);
        jFrame.setBounds(300,200,400,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

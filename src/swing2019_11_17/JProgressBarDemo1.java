package swing2019_11_17;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo1 implements ActionListener, ChangeListener {
    JFrame jFrame = null;
    JProgressBar jProgressBar;
    JLabel jLabel;
    Timer timer;
    JButton jButton;

    public static void main(String[] args) {
        new JProgressBarDemo1();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton){
            timer.start();
        }
        if (e.getSource()==timer){
            int value = jProgressBar.getValue();
            if (value<100){
                jProgressBar.setValue(++value);
            }else{
                timer.stop();
                jFrame.dispose();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = jProgressBar.getValue();
        if (e.getSource()==jProgressBar){
            jLabel.setText("目前进度已完成："+Integer.toString(value)+" %");
            jLabel.setForeground(Color.blue);
        }
    }
    public JProgressBarDemo1(){
        jFrame=new JFrame("软件安装");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        jLabel = new JLabel(" ",JLabel.CENTER);
        jProgressBar=new JProgressBar();
        jProgressBar.setOrientation(JProgressBar.HORIZONTAL);
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true);
        jProgressBar.addChangeListener(this);
        jProgressBar.setPreferredSize(new Dimension(300,20));
        jProgressBar.setBorderPainted(true);
        jProgressBar.setBackground(Color.pink);
        //添加安装按钮
        JPanel jPanel = new JPanel();
        jButton = new JButton("安装");
        jButton.setForeground(Color.blue);
        jButton.addActionListener(this);
        jPanel.add(jButton);
        //创建一个计时器，计时间隔为100ms
        timer = new Timer(100,this);
        container.add(jPanel,BorderLayout.NORTH);
        container.add(jProgressBar,BorderLayout.CENTER);
        container.add(jLabel,BorderLayout.SOUTH);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}

package swing2019_11_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo extends JFrame {
    public JProgressBarDemo(){
        setTitle("使用进度条");
        JLabel jLabel = new JLabel("欢迎使用在线升级功能");
        //创建一个进度条
        JProgressBar jProgressBar = new JProgressBar();
        JButton jButton = new JButton("完成");
        jButton.setEnabled(false);
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,1));
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jPanel1.add(jLabel);
        jPanel2.add(jProgressBar);
        jPanel3.add(jButton);
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        //设置 stringPainted 属性的值，该属性确定进度条是否应该呈现进度字符串,也就是显示"升级进行中..."的值
        jProgressBar.setStringPainted(true);
        jProgressBar.setString("升级进行中...");
        //如果需要使用不确定模式，可使用此行
//        jProgressBar.setIndeterminate(true);
        //开启一个处理进度进程
        new Progress(jProgressBar,jButton).start();
        //单击“完成”按钮结束程序
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    private class Progress extends Thread{
        JProgressBar progressBar;
        JButton jButton;
        //进度条上的数字
        int [] progressValue={6,18,27,39,51,66,81,100};
        Progress(JProgressBar jProgressBar ,JButton jButton){
            this.progressBar=jProgressBar;
            this.jButton=jButton;
        }

        @Override
        public void run() {
            for (int i=0;i<progressValue.length;i++){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.setValue(progressValue[i]);
                progressBar.setString(String.valueOf(progressValue[i])+"%");
            }
            progressBar.setIndeterminate(false);
            progressBar.setString("升级完成！");
            jButton.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        JProgressBarDemo frame = new JProgressBarDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

}

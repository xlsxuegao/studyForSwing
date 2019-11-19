package swing2019_11_17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JListDemo1 extends JFrame {
    public JListDemo1(){
        setTitle("Java列表框组件示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);
        JList list = new JList();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);
        String [] listData = new String[12];
        for (int i=0;i<listData.length;i++){
            listData[i]="这是列表框的第"+(i+1)+"个元素";
        }
        list.setListData(listData);

    }

    public static void main(String[] args) {
        JListDemo1 jListDemo1 = new JListDemo1();
        jListDemo1.setVisible(true);
    }
}

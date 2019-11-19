package swing2019_11_17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListDemo2 extends JFrame {
    JList list;
    JLabel jLabel;
    public JListDemo2(){
        setTitle("监听列表项选择事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        jLabel=new JLabel(" ");
        contentPane.add(jLabel,BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);

        list = new JList();
        scrollPane.setViewportView(list);
        String [] listData = new String[7];
        listData[0]="《一点就通学Java》";
        listData[1]="《一点就通学PHP》";
        listData[2]="《一点就通学Visual Basic）》";
        listData[3]="《一点就通学Visual C++）》";
        listData[4]="《Java编程词典》";
        listData[5]="《PHP编程词典》";
        listData[6]="《C++编程词典》";
        list.setListData(listData);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                do_list_valueChanged(e);
            }
        });
    }
    protected  void do_list_valueChanged(ListSelectionEvent event){
        jLabel.setText("感谢您购买："+list.getSelectedValue());
    }
    public static void main(String[] args) {
        JListDemo2 frame = new JListDemo2();
        frame.setVisible(true);
    }
}

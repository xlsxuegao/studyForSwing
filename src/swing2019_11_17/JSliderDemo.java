package swing2019_11_17;

import javax.swing.*;
import java.awt.*;

public class JSliderDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("滑块组件示例");
        jFrame.setSize(100,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        JSlider slider = new JSlider(0,100);
        slider.setMajorTickSpacing(10);//设置主刻度的标记间隔为10
        slider.setMinorTickSpacing(5);//设置次刻度的标记间隔为5
        slider.setPaintLabels(true);//确定是否在滑块上绘制标签
        slider.setPaintTicks(true);//确定是否在滑块上绘制刻度标记
        container.add(slider);
        jFrame.setVisible(true);
    }
}

package hello_world;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 切换页面 {
    public static void main(String[] args) {
        // 创建 JFrame 对象
        JFrame frame = new JFrame("Switch Interface");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建 JPanel 对象
        JPanel panel = new JPanel();
        JButton switchButton = new JButton("JButton");
        panel.add(switchButton);

        // 添加按钮的点击事件监听器
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 清空窗口内容
                frame.getContentPane().removeAll();

                // 创建 JLabel 对象并添加到窗口
                JLabel successLabel = new JLabel("切换成功！");
                frame.add(successLabel);

                // 重新验证并重绘窗口
                frame.revalidate();
                frame.repaint();
            }
        });

        // 将面板添加到窗口
        frame.add(panel);
        frame.setVisible(true);
    }
}
package com.ma.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame()
    {
       this.setSize(488, 500);
       this.setVisible(true);
        // 设置界面的标题
        this.setTitle("拼图注册");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

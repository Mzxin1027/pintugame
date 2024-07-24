package com.ma.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame()
    {
        this.setSize(488, 430);
        this.setVisible(true);
        // 设置界面的标题
        this.setTitle("拼图登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

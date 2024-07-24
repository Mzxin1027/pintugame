package com.ma.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        initJmenuBar();
        initImage();
        this.setVisible(true);
        
        
    }

    private void initImage() {
        //创建一个图片
        ImageIcon imageIcon = new ImageIcon("D:\\workspace\\pintugame\\image\\微信图片_202402081921111.jpg");
        JLabel jLabel = new JLabel(imageIcon);
        this.add(jLabel);
    }

    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(1800, 1800);
        this.setVisible(true);
        // 设置界面的标题
        this.setTitle("拼图游戏");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initJmenuBar() {
        //创建菜单
        JMenuBar jmenuBar = new JMenuBar();

        JMenu functionjmenu = new JMenu("功能");
        JMenu aboutjmenu = new JMenu("关于我们");


        JMenuItem replayjmenuItem = new JMenuItem("重新游戏");
        JMenuItem reloginjmenuItem1 = new JMenuItem("重新登录");
        JMenuItem clodejmenuItem = new JMenuItem("退出游戏");

        JMenuItem aboutjmenuItem = new JMenuItem("公众号");

        functionjmenu.add(replayjmenuItem);
        functionjmenu.add(reloginjmenuItem1);
        functionjmenu.add(clodejmenuItem);


        aboutjmenu.add(aboutjmenuItem);

        jmenuBar.add(functionjmenu);
        jmenuBar.add(aboutjmenu);

        this.setJMenuBar(jmenuBar);
    }


}

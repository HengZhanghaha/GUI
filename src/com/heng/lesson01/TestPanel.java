package com.heng.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/11:12
 */
//面板,是一个空间，不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("测试Panel");
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(200,200,500,500);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);

        //设置panel1坐标
        panel1.setBounds(50,50,100,200);
        panel1.setBackground(new Color(243, 214, 0));
        //设置panel2坐标
        panel2.setBounds(400,200,50,50);
        panel2.setBackground(new Color(0, 214, 0));

        //加入到Frame
        frame.add(panel1);
        frame.add(panel2);
        //监听事件，关闭窗口
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //关闭窗口
                System.exit(0);
            }
        });
    }
}

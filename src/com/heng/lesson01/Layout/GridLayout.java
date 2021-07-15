package com.heng.lesson01.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/12:07
 */
//表格布局
public class GridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout(表格布局)");
        frame.setVisible(true);
        frame.setBounds(200,200,600,400);
        frame.setBackground(Color.BLUE);

        //组件
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");

        frame.setLayout(new java.awt.GridLayout(3,2));
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);

        frame.pack(); //java函数，自动计算最佳布局

        //退出
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

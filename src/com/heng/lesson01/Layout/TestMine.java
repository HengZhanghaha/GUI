package com.heng.lesson01.Layout;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/12:24
 */

//test布局
public class TestMine {
    public static void main(String[] args) {
        Frame frame = new Frame("testMine");
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");
        Button bt7 = new Button("bt7");
        Button bt8 = new Button("bt8");
        Button bt9 = new Button("bt9");
        Button bt0 = new Button("bt0");

        frame.setLayout(new GridLayout(2,3,20,20));
        frame.add(bt1);
        frame.add(panel1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(panel2);
        frame.add(bt4);
        panel1.setLayout(new GridLayout(2,1,10,15));
        panel1.add(bt5);
        panel1.add(bt6);
        panel1.setBackground(Color.YELLOW);
        panel2.setLayout(new GridLayout(2,2,10,10));
        panel2.add(bt7);
        panel2.add(bt8);
        panel2.add(bt9);
        panel2.add(bt0);

        frame.setVisible(true);
        frame.setBounds(200,200,500,400);
        frame.setBackground(Color.CYAN);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

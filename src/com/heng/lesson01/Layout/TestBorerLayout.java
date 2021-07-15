package com.heng.lesson01.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/12:00
 */
//东西南北中布局
public class TestBorerLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("borerLayout(东西南北中)");
        frame.setVisible(true);
        frame.setBounds(200,200,600,400);
        frame.setBackground(Color.CYAN);

        //组件
        Button north = new Button("north");
        Button south = new Button("south");
        Button west = new Button("west");
        Button east = new Button("east");
        Button center = new Button("center");

        //设置布局
        frame.setLayout(new BorderLayout());
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(east,BorderLayout.EAST);
        frame.add(center,BorderLayout.CENTER);

        //关闭
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

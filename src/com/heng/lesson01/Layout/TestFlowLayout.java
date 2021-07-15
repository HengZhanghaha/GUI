package com.heng.lesson01.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/11:51
 */

//流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout(流式布局)");
        frame.setBounds(200,200,500,400);
        frame.setVisible(true);
        //组件-按钮
        Button button1 = new Button("bt1");
        Button button2 = new Button("bt2");
        Button button3 = new Button("bt3");

        //设置流式布局
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));


        //按钮添加
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

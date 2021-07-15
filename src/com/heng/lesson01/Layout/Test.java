package com.heng.lesson01.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/12:14
 */
public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame("习题");
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        Button b6 = new Button("b6");
        Button b7 = new Button("b7");
        Button b8 = new Button("b8");
        Button b9 = new Button("b9");
        Button b10 = new Button("b10");

        frame.setLayout(new java.awt.GridLayout(2,3));
        frame.add(b1);
        frame.add(p1);
        frame.add(b4);
        frame.add(b5);
        frame.add(p2);
        frame.add(b10);
        p1.setLayout(new java.awt.GridLayout(2,1));
        p1.add(b2);
        p1.add(b3);
        p2.setLayout(new java.awt.GridLayout(2,2));
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}

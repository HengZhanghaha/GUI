package com.heng.lesson01;

import java.awt.*;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/10:54
 */
//展示多个窗口
public class TestFrame2 {
    public static void main(String[] args) {

        Frame frame1 = new MyFrame(100,100,200,200,Color.BLUE);
        Frame frame2 = new MyFrame(300,100,200,200,Color.RED);
        Frame frame3 = new MyFrame(100,300,200,200,Color.YELLOW);
        Frame frame4 = new MyFrame(300,300,200,200,Color.PINK);
    }
}

class MyFrame extends Frame{
    private static int id = 0;

    public MyFrame(int x,int y,int w,int h,Color color) {
        super("Frame" + (++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);

    }
}

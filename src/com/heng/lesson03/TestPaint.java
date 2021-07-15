package com.heng.lesson03;

import java.awt.*;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/24/9:46
 */
public class TestPaint {
    public static void main(String[] args) {

        new MyPaint().loadPaint();
    }
}
class MyPaint extends Frame{
    public void loadPaint(){
        setVisible(true);
        setBounds(200,200,600,500);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(100,100,50,50);
        g.draw3DRect(300,300,100,100,true);
    }
}

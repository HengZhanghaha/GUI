package com.heng.lesson01;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/10:36
 */

import java.awt.*;

//第一个GUI界面
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个Frame窗口");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设计背景颜色
        frame.setBackground(new Color(8, 232, 214));
        //初始位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);
    }
}

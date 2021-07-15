package com.heng.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Editor: 张恒
 * tel： XXXXXXXXXXXXX
 * Wechat：zh17530588817
 * date: 2021/4/23/18:52
 */
//事件监听
public class TestActionListerner {
    public static void main(String[] args) {
        Frame frame = new Frame("事件监听");
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("quit!");
        MyactionListener myactionListener = new MyactionListener();
        bt1.addActionListener(myactionListener);
        bt2.addActionListener(myactionListener);
        bt3.addActionListener(myactionListener);


        frame.add(bt1,BorderLayout.SOUTH);
        frame.add(bt2,BorderLayout.NORTH);
        frame.add(bt3,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
        close(frame);
    }

    private static void close(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyactionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("msg : " + e.getActionCommand());
        if (e.getActionCommand().equals("bt1")){
            System.out.println("hello bt111111!!");
        }else if (e.getActionCommand().equals("bt2")){
            System.out.println("hihi,bt2222!");
        }else {
            System.out.println("Over！！");
            System.exit(0);
        }
    }
}

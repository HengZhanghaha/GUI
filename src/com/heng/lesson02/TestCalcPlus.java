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
 * date: 2021/4/23/20:01
 */
public class TestCalcPlus {
    public static void main(String[] args) {
        new MyCalc2().run();
    }
}
class MyCalc2 extends Frame {
    TextField field1,field2,field3;
    //三个输入框，一个按钮，一个label

    public void run(){
        field1 = new TextField(10);
        field2 = new TextField(10);
        field3 = new TextField(20);
        Button bt1 = new Button("=");
        Label label = new Label("+");
        setLayout(new FlowLayout());

        bt1.addActionListener(new CalcListener2());
        bt1.setBackground(Color.CYAN);
        add(field1);
        add(label);
        add(field2);
        add(bt1);
        add(field3);

        setVisible(true);
        pack();
        close(this);
    }

    private static void close(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Over!!");
                System.exit(0);
            }
        });

    }
    private class CalcListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(field1.getText());
            int n2 = Integer.parseInt(field2.getText());

            field3.setText("" +(n1+n2));
            field1.setText("");
            field2.setText("");

        }
    }
}

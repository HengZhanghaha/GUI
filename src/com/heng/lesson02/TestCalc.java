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
 * date: 2021/4/23/19:33
 */
public class TestCalc {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc("TextCalc");
    }
}
class MyCalc extends Frame{
    TextField field1,field2,field3;
    //三个输入框，一个按钮，一个label
    public MyCalc(String name){
        super(name);
        field1 = new TextField(10);
        field2 = new TextField(10);
        field3 = new TextField(20);
        Button bt1 = new Button("=");
        Label label = new Label("+");
        setLayout(new FlowLayout());

        bt1.addActionListener(new CalcListener(this));
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
}
class CalcListener implements ActionListener{
    private MyCalc myCalc = null;

    public CalcListener(MyCalc myCalc) {
        this.myCalc = myCalc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(myCalc.field1.getText());
        int n2 = Integer.parseInt(myCalc.field2.getText());

        myCalc.field3.setText("" +(n1+n2));
        myCalc.field1.setText("");
        myCalc.field2.setText("");

    }
}
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
 * date: 2021/4/23/19:10
 */

//输入框TextField
public class TestTextField {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("TestTextField");
        close(myFrame);

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
class MyFrame extends Frame{
    public MyFrame(String label){
        super(label);
        TextField textField = new TextField();
        add(textField);

        MyTextListener myTextListener = new MyTextListener();
        textField.addActionListener(myTextListener);
        setVisible(true);
        pack();
    }
}

class MyTextListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();  //获得一个对象
        System.out.println(textField.getText());
        textField.setText(""); //按下回车键后清除
    }
}

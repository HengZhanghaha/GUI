# GUI编程

## 1.简介

核心：Swing,AWT

* 因为界面不美观

* 需要jre环境

为什么要学习？

* 可以写出自己的一些小工具

* 了解MVC加购，了解监听

## 2.AWT

### 2.1AWT介绍

1.很多类和接口，GUI

2.元素：窗口，按钮，文本框

2.java.awt

![image-20210423104233692](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423104233692.png)

### 2.2组建和容器(无限嵌套)

#### 1.Frame界面（最顶级）

```java

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
```

![image-20210423112254564](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423112254564.png)

![image-20210423112317826](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423112317826.png)

#### 2.面板panel

```java
//面板,是一个空间，不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("测试Panel");
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(200,200,500,500);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);

        //设置panel1坐标
        panel1.setBounds(50,50,100,200);
        panel1.setBackground(new Color(243, 214, 0));
        //设置panel2坐标
        panel2.setBounds(400,200,50,50);
        panel2.setBackground(new Color(0, 214, 0));

        //加入到Frame
        frame.add(panel1);
        frame.add(panel2);
        //监听事件，关闭窗口
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //关闭窗口
                System.exit(0);
            }
        });
    }
}

```

![image-20210423112336710](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423112336710.png)

#### 3.布局管理器

* 流式布局

```java
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
```

![image-20210423123452639](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423123452639.png)

* 东西南北中

```java
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

```

![image-20210423123506198](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423123506198.png)

* 表格布局

  ```java
  package com.heng.lesson01.Layout;
  
  import java.awt.*;
  import java.awt.event.WindowAdapter;
  import java.awt.event.WindowEvent;
  
  /*
   * Editor: 张恒
   * tel： XXXXXXXXXXXXX
   * Wechat：zh17530588817
   * date: 2021/4/23/12:07
   */
  //表格布局
  public class GridLayout {
      public static void main(String[] args) {
          Frame frame = new Frame("GridLayout(东西南北中)");
          frame.setVisible(true);
          frame.setBounds(200,200,600,400);
          frame.setBackground(Color.BLUE);
  
          //组件
          Button bt1 = new Button("bt1");
          Button bt2 = new Button("bt2");
          Button bt3 = new Button("bt3");
          Button bt4 = new Button("bt4");
          Button bt5 = new Button("bt5");
          Button bt6 = new Button("bt6");
  
          frame.setLayout(new java.awt.GridLayout(3,2));
          frame.add(bt1);
          frame.add(bt2);
          frame.add(bt3);
          frame.add(bt4);
          frame.add(bt5);
          frame.add(bt6);
  
          frame.pack(); //java函数，自动计算最佳布局
  
          //退出
          frame.addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                  System.exit(0);
              }
          });
      }
  }
  
  ```

  ![image-20210423123422607](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423123422607.png)

* 测试布局

  ```java
  //test布局
  public class TestMine {
      public static void main(String[] args) {
          Frame frame = new Frame("testMine");
          Panel panel1 = new Panel();
          Panel panel2 = new Panel();
          Button bt1 = new Button("bt1");
          Button bt2 = new Button("bt2");
          Button bt3 = new Button("bt3");
          Button bt4 = new Button("bt4");
          Button bt5 = new Button("bt5");
          Button bt6 = new Button("bt6");
          Button bt7 = new Button("bt7");
          Button bt8 = new Button("bt8");
          Button bt9 = new Button("bt9");
          Button bt0 = new Button("bt0");
  
          frame.setLayout(new GridLayout(2,3,20,20));
          frame.add(bt1);
          frame.add(panel1);
          frame.add(bt2);
          frame.add(bt3);
          frame.add(panel2);
          frame.add(bt4);
          panel1.setLayout(new GridLayout(2,1,10,15));
          panel1.add(bt5);
          panel1.add(bt6);
          panel1.setBackground(Color.YELLOW);
          panel2.setLayout(new GridLayout(2,2,10,10));
          panel2.add(bt7);
          panel2.add(bt8);
          panel2.add(bt9);
          panel2.add(bt0);
  
          frame.setVisible(true);
          frame.setBounds(200,200,500,400);
          frame.setBackground(Color.CYAN);
          frame.addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                  System.exit(0);
              }
          });
      }
  }
  
  ```

  

![image-20210423123606304](C:\Users\张恒\AppData\Roaming\Typora\typora-user-images\image-20210423123606304.png)

#### 4.事件监听

ActionListerner类

```java
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

```

#### 5.输入框TextField

 ```java
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

 ```




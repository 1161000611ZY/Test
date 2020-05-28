package Test_gui_7;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test_gui_7 extends JFrame {
    
        //定义组件
         JPanel jp1,jp2,jp3;
         JLabel jl1,jl2;
         JButton jb1,jb2;
         JCheckBox jcb1,jcb2,jcb3;
         JRadioButton jrb1,jrb2;
         ButtonGroup bg;//同一组单选按钮必须先创建ButtonGroup，
                        //然后把单选框组件放入到ButtonGroup
            public static void main(String[] args) {
                Test_gui_7 test_gui_7=new Test_gui_7();
            }
            //构造函数
            public Test_gui_7()
            {
            jp1=new JPanel();
            jp2=new JPanel();
            jp3=new JPanel();
            
            
            jl1=new JLabel("你喜欢的运动");
            jl2=new JLabel("你的性别");
            
            jb1=new JButton("注册用户");
            jb2=new JButton("取消注册");
            
            jcb1=new JCheckBox("足球");
            jcb2=new JCheckBox("篮球");
            jcb3=new JCheckBox("网球");
            
            jrb1=new JRadioButton("男");
            jrb2=new JRadioButton("女");
            //一定要把jrb1,jrb2放入到一个ButtonGroup中
            ButtonGroup bg=new ButtonGroup();
            bg.add(jrb1);
            bg.add(jrb2);
            //设置布局管理器
            this.setLayout(new GridLayout(3,1));
            
            //添加组件
            //第一行
            jp1.add(jl1);
            jp1.add(jcb1);
            jp1.add(jcb2);
            jp1.add(jcb3);
            //第二行
            jp2.add(jl2);
            jp2.add(jrb1);
            jp2.add(jrb2);
            //第三行
            jp3.add(jb1);
            jp3.add(jb2);
            
            //加入到JFrame
            this.add(jp1);
            this.add(jp2);
            this.add(jp3);
            
            //给窗口设置一个标题
            this.setTitle("会员注册");
            //给窗口设置一个大小
            this.setSize(300, 300);
            //禁止用户改变窗口的大小
            this.setResizable(false);
            //设置窗口的初始位置
            this.setLocationRelativeTo(null);
            //this.setLocation(300, 300);
            //设置当关闭窗口时，保证JVM也关闭
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //显示
            this.setVisible(true);
            }
}

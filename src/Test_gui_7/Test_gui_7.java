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
    
        //�������
         JPanel jp1,jp2,jp3;
         JLabel jl1,jl2;
         JButton jb1,jb2;
         JCheckBox jcb1,jcb2,jcb3;
         JRadioButton jrb1,jrb2;
         ButtonGroup bg;//ͬһ�鵥ѡ��ť�����ȴ���ButtonGroup��
                        //Ȼ��ѵ�ѡ��������뵽ButtonGroup
            public static void main(String[] args) {
                Test_gui_7 test_gui_7=new Test_gui_7();
            }
            //���캯��
            public Test_gui_7()
            {
            jp1=new JPanel();
            jp2=new JPanel();
            jp3=new JPanel();
            
            
            jl1=new JLabel("��ϲ�����˶�");
            jl2=new JLabel("����Ա�");
            
            jb1=new JButton("ע���û�");
            jb2=new JButton("ȡ��ע��");
            
            jcb1=new JCheckBox("����");
            jcb2=new JCheckBox("����");
            jcb3=new JCheckBox("����");
            
            jrb1=new JRadioButton("��");
            jrb2=new JRadioButton("Ů");
            //һ��Ҫ��jrb1,jrb2���뵽һ��ButtonGroup��
            ButtonGroup bg=new ButtonGroup();
            bg.add(jrb1);
            bg.add(jrb2);
            //���ò��ֹ�����
            this.setLayout(new GridLayout(3,1));
            
            //������
            //��һ��
            jp1.add(jl1);
            jp1.add(jcb1);
            jp1.add(jcb2);
            jp1.add(jcb3);
            //�ڶ���
            jp2.add(jl2);
            jp2.add(jrb1);
            jp2.add(jrb2);
            //������
            jp3.add(jb1);
            jp3.add(jb2);
            
            //���뵽JFrame
            this.add(jp1);
            this.add(jp2);
            this.add(jp3);
            
            //����������һ������
            this.setTitle("��Աע��");
            //����������һ����С
            this.setSize(300, 300);
            //��ֹ�û��ı䴰�ڵĴ�С
            this.setResizable(false);
            //���ô��ڵĳ�ʼλ��
            this.setLocationRelativeTo(null);
            //this.setLocation(300, 300);
            //���õ��رմ���ʱ����֤JVMҲ�ر�
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //��ʾ
            this.setVisible(true);
            }
}

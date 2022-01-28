package day0126;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseTextComponent extends JFrame {
	
	public UseTextComponent() {
		super("TextComponent����");
		
		JTextField jtf = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JTextArea jta = new JTextArea();
		
		//�۲� ����.
		jtf.setFont(new Font("�޸�����ü",Font.BOLD,20));
		jta.setFont(new Font("�ü�ü",Font.ITALIC|Font.BOLD,25));
		
		//���⹮�� ����.
		jpf.setEchoChar('*');
		//JTA�� �� ������ �ٲ�.(�ڵ� �ٹٲ�)
		jta.setLineWrap(true);
		//JTA�� �ܾ� ��ȣ �ɼ�.(�ѱ� x)
		jta.setWrapStyleWord(true);
		
		//JTextArea�� ScrollBar�� �����Ƿ� JScrollBar�� ������ JScrollPane�� has a���Ը� ������ ��
		JScrollPane jsp = new JScrollPane(jta);
		
		//border����
		jtf.setBorder(new TitledBorder("�̸�"));
		jpf.setBorder(new TitledBorder("����"));
		jsp.setBorder(new TitledBorder("���"));
		
		//��ġ
		setLayout(null);
		
		//��ǥ, ũ�⼳��
		jtf.setBounds(20, 30, 200, 50);
		jpf.setBounds(20, 100, 200, 50);
//		jta.setBounds(20, 170, 200, 200); 
		jsp.setBounds(20, 170, 200, 200);//JTextArea�� �ƴ� JTA�� ���� JSP�� ũ��� ��ġ�� �����Ѵ�. 
		
		
		
		//��ġ
		add(jtf);
		add(jpf);
		//JTextArea�� ���� JScrollPane�� ��ġ�Ѵ�.
		add(jsp);
		
		//������ ũ�⼳��
		setBounds(100, 100, 250, 460);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseTextComponent
	public static void main(String[] args) {
		new UseTextComponent();
	}//main

}//class

package day0126;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class Homework0126 extends JFrame {
	public Homework0126() {
		super("�������");
		//2.������Ʈ ����
		JLabel jlblNumber = new JLabel("��ȣ");
		JTextField jtfNumber = new JTextField(10);
		
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10);
		
		JLabel jlblGender = new JLabel("����");
		JRadioButton jrbM = new JRadioButton("��");
		JRadioButton jrbF = new JRadioButton("��");
		
		JLabel jlblEmail = new JLabel("�̸���");
		JTextField jtfEmail = new JTextField(10);
		
		JTextArea jta = new JTextArea();
		
		JButton plus = new JButton("�߰�");
		JButton del = new JButton("����");
		JButton chg = new JButton("����");
		JButton exit = new JButton("�ݱ�");
		
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbM);
		bg.add(jrbF);
		
		jta.setBorder(new TitledBorder("������"));
		
		//3.��ġ
		setLayout(null);
	
		add(jlblNumber);
		add(jtfNumber);
		add(jlblName);
		add(jtfName);
		
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		
		add(jlblEmail);
		add(jtfEmail);
		
		add(jta);
		
		add(plus);
		add(del);
		add(chg);
		add(exit);
	
		
		//��ǥ, ũ�� ����
		jlblNumber.setBounds(10, 15, 100, 10);
		jtfNumber.setBounds(50, 10, 100, 20);
		
		jlblName.setBounds(10, 40, 100, 20);
		jtfName.setBounds(50, 40, 100, 20);
		
		jlblGender.setBounds(10, 65, 100, 20);
		jrbM.setBounds(50, 65, 40, 20);
		jrbF.setBounds(110, 65, 40, 20);
		
		jlblEmail.setBounds(10, 90, 100, 20);
		jtfEmail.setBounds(50, 90, 100, 20);
		
		jta.setBounds(180, 15, 150, 100);
		
		plus.setBounds(45, 120, 60, 25);
		del.setBounds(110, 120, 60, 25);
		chg.setBounds(175, 120, 60, 25);
		exit.setBounds(240, 120, 60, 25);
		
		
		//4.������ ũ�� ����
		setSize(360, 200);
		
		//5.����ȭ
		setVisible(true);
		
		//6.����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Homework0126();
	}//main

}//class

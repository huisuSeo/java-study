package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
//1.�̺�Ʈ ó�� ������ ����
public class TestEvent extends JFrame implements ActionListener{
	//2.�̺�Ʈó�� ���� ������Ʈ ����   1
	private JButton jbtn;
	
	public TestEvent() {
		super("is a������ �̺�Ʈó��");
		//3.������Ʈ ��üȭ
		jbtn = new JButton("����");
		//4.������Ʈ�� �̺�Ʈ ���   2
		jbtn.addActionListener(this);//��ư���� �̺�Ʈ�� �߻��ϸ� this(���簴ü)���� ������ method�� ȣ��
		//5.��ġ
		JPanel jp = new JPanel();
		jp.add(jbtn);//��ư��; ����ũ�⸦ ������ �гο� ��ġ
		
		add("Center",jp);
		
		//6.������ ũ�� ����
		setSize(300,300);
		setVisible(true);
		//7.����ó��	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestEvent
	
	//8.�߻�method Override   3
	public void actionPerformed(ActionEvent ae) {
		//9.�̺�Ʈ�� �߻����� �� ����ڿ��� ������ �ڵ�
//		System.out.println("��ư�� ������");
		dispose();
	}
	public static void main(String[] args) {
		new TestEvent();
		}//main

}//class
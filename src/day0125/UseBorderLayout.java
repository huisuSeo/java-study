package day0125;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * BorderLayout
 * @author user
 *
 */
@SuppressWarnings("serial")
public class UseBorderLayout extends JFrame {
//1.������ ������Ʈ�� ���
	
	public UseBorderLayout() {
		super("��跹�̾ƿ�����");
		//2.������Ʈ�� ����.
		JButton jbtnSouth = new JButton("South");
		JButton jbtnEast = new JButton("East");
		JLabel jlblNorth = new JLabel("����");
		JLabel jlblWest = new JLabel("����");
		JTextArea jtaCenter = new JTextArea("��� TextArea");
		
		//3.������Ʈ�� ��ġ
		//��ġ������ ����
//		setLayout(new BorderLayout());//�ص��ǰ� ���ص� �ǰ�
		//���ڿ� ���
		add("North",jlblNorth);
		add("South",jbtnSouth);
		//BorderLayout Constant
		add(BorderLayout.CENTER,jtaCenter);
		add(BorderLayout.WEST,jlblWest);
		add(jbtnEast,BorderLayout.EAST);
		
		//4.������ ũ�� ����.
		setSize(400,400);
		
		//5.����ȭ
		setVisible(true);
		
		//6.������ ���� �̺�Ʈ ó��.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseBorderLayout
	public static void main(String[] args) {
		new UseBorderLayout();
	}//main

}//class

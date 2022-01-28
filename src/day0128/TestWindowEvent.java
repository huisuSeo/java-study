package day0128;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends JFrame implements WindowListener{

	public TestWindowEvent() {
		super("������ �̺�Ʈ ����");
		
		//�̺�Ʈ ���
		addWindowListener(this);
		setSize(300, 400);
		setVisible(true);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose();//������ �۾��� ����ǰ�
//		System.exit(1);// 0-���� ����(JVM�� �������μ����� �����ϰ� ����), 
		//1-������ ����(JVM�� �������μ����� �ߴ��ϰ� ����)
	}//windowClosing
	@Override
	public void windowClosed(WindowEvent e) {//���� �Ϸ�� �� ȣ��
		System.out.println("windowClosed");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
	public static void main(String[] args) {
		new TestWindowEvent();
	}//main

}//class

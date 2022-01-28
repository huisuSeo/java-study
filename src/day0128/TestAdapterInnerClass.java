package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {
	
	public TestAdapterInnerClass() {
		super("Inner class �� ����� �̺�Ʈ ó�����");
		
		
		
		addWindowListener(new InnerEvt());
		
		setSize(400, 300);
		setVisible(true);
		
	}//TestAdapterInnerClass
	
	////////////////////////////////////inner class ����////////////////////////////////////////////
	public class InnerEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Inner class���� ó���� ������ ���� �̺�Ʈ");
			dispose();//window class�� ���� class������ inner class �� �ٱ� Ŭ������ method�� ����� ����� �� �ִ�.
		}//windowClosing
		
	}//class
	////////////////////////////////////////inner class ��////////////////////////////////////////
	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}//class

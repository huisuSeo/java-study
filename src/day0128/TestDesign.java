package day0128;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestDesign extends JFrame {

	public TestDesign() {
		super("�ܺ�Ŭ�������� �̺�Ʈ ó��");
		
		//has a ����� �̺�Ʈ�� ����.
		TestAdapterHasA taha = new TestAdapterHasA(this);
		//������ Ŭ�������� �߻��� �̺�Ʈ�� has a ������ Ŭ������ ó���ϵ��� ���.
		addWindowListener(taha);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestDesign();
	}//main

}//class

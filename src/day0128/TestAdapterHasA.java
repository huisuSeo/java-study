package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ������ Ŭ������ �޾�(had a) ������Ŭ������ �̺�Ʈ�� ó���ϴ� Ŭ����
 * @author user
 *
 */
public class TestAdapterHasA extends WindowAdapter {
	private TestDesign td;//���� ��ü�� �� Ŭ������ ��� instance �������� ����ϱ� ����.
	public TestAdapterHasA(TestDesign td) {//has a
		this.td = td;
	}//TestAdapterHasA

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ܺ�Ŭ�������� ������ ���� �̺�Ʈ ó��");
		
//		dispose();//testAdapterHasA Ŭ������ ��� �ٿ��� �� ����� �������� �ʴ´�.
		td.dispose();
	}//windowClosing

}//class

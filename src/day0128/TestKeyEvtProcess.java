package day0128;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a ����� TestKeyEvtDesign Ŭ������ �̺�Ʈ�� ó���� Ŭ����
 * @author user
 *
 */
@SuppressWarnings("serial")
public class TestKeyEvtProcess extends WindowAdapter implements KeyListener{
	private TestKeyEvtDesign tked;
	
	public TestKeyEvtProcess(TestKeyEvtDesign tked) {
		this.tked = tked;
		
	}
	
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		tked.dispose();
	}




	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyTyped");
	}//keyTyped

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("KeyPressed");
		//����Ű�� Ű ��, Ű �ڵ� ���
	}//keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("KeyReleased");
		//���� Ű�� Ű ��, Ű �ڵ� ���
		//���� Ű�� Ű�ڵ� ���� ������ Ŭ������ JLabel�� ���.
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()) + " / " + ke.getKeyChar());
		
		//�ֿܼ�JTextField�� �Էµ� ��� ���ڿ��� ���
		System.out.println(tked.getJtfKey().getText());
		
		//ESCŰ�� �������� ���α׷��� ����.
		switch(ke.getKeyCode()) {
		case KeyEvent.VK_ESCAPE :
			tked.dispose();
		}//switch
		
	}//keyReleased

	public static void main(String[] args) {

	}

}

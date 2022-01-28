package day0128;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계로 TestKeyEvtDesign 클래스의 이벤트를 처리할 클래스
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
		//눌린키의 키 값, 키 코드 얻기
	}//keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("KeyReleased");
		//눌린 키의 키 값, 키 코드 얻기
		//눌린 키의 키코드 값을 디자인 클래스의 JLabel에 출력.
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()) + " / " + ke.getKeyChar());
		
		//콘솔에JTextField에 입력된 모든 문자열을 출력
		System.out.println(tked.getJtfKey().getText());
		
		//ESC키가 눌려지면 프로그램을 종료.
		switch(ke.getKeyCode()) {
		case KeyEvent.VK_ESCAPE :
			tked.dispose();
		}//switch
		
	}//keyReleased

	public static void main(String[] args) {

	}

}

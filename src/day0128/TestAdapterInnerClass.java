package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {
	
	public TestAdapterInnerClass() {
		super("Inner class 를 사용한 이벤트 처리방법");
		
		
		
		addWindowListener(new InnerEvt());
		
		setSize(400, 300);
		setVisible(true);
		
	}//TestAdapterInnerClass
	
	////////////////////////////////////inner class 시작////////////////////////////////////////////
	public class InnerEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Inner class에서 처리한 윈도우 종료 이벤트");
			dispose();//window class의 종료 class이지만 inner class 는 바깥 클래스의 method를 맘대로 사용할 수 있다.
		}//windowClosing
		
	}//class
	////////////////////////////////////////inner class 끝////////////////////////////////////////
	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}//class

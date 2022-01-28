package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 디자인 클래스를 받아(had a) 디자인클래스의 이벤트를 처리하는 클래스
 * @author user
 *
 */
public class TestAdapterHasA extends WindowAdapter {
	private TestDesign td;//받은 객체를 이 클래스의 모든 instance 영역에서 사용하기 위해.
	public TestAdapterHasA(TestDesign td) {//has a
		this.td = td;
	}//TestAdapterHasA

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("외부클래스에서 윈도우 종료 이벤트 처리");
		
//		dispose();//testAdapterHasA 클래스의 상속 줄에는 이 기능이 존재하지 않는다.
		td.dispose();
	}//windowClosing

}//class

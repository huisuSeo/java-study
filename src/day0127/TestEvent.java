package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
//1.이벤트 처리 리스너 구현
public class TestEvent extends JFrame implements ActionListener{
	//2.이벤트처리 관련 컴포넌트 선언   1
	private JButton jbtn;
	
	public TestEvent() {
		super("is a관계의 이벤트처리");
		//3.컴포넌트 객체화
		jbtn = new JButton("종료");
		//4.컴포넌트의 이벤트 등록   2
		jbtn.addActionListener(this);//버튼에서 이벤트가 발생하면 this(현재객체)에서 구현한 method기 호출
		//5.배치
		JPanel jp = new JPanel();
		jp.add(jbtn);//버튼이; 고유크기를 가지고 패널에 배치
		
		add("Center",jp);
		
		//6.윈도우 크기 설정
		setSize(300,300);
		setVisible(true);
		//7.종료처리	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestEvent
	
	//8.추상method Override   3
	public void actionPerformed(ActionEvent ae) {
		//9.이벤트가 발생했을 때 사용자에게 제공할 코드
//		System.out.println("버튼이 눌렸음");
		dispose();
	}
	public static void main(String[] args) {
		new TestEvent();
		}//main

}//class

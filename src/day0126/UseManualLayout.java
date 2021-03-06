package day0126;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseManualLayout extends JFrame {
	public UseManualLayout() {
		super("수동배치 연습");
		//2. 컴포넌트 생성.
		JLabel jlbl = new JLabel("라벨");
		
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("자바");
		jcb.addItem("오라클");
		jcb.addItem("콤보박스");

		String[] data = "전민정, 정인선, 장정우, 김진영, 김현우".split(",");
		JList<String> jl = new JList<String>(data);
		
		//색변경
		//바닥색
		jlbl.setOpaque(true); //투명도 해제
//		jlbl.setBackground(Color.CYAN); //바닥색 설정
		jlbl.setBackground(new Color(0xFFFFAF)); //바닥색 설정
		//전경색
		jlbl.setForeground(Color.RED);
		
		//3. 배치
		//기존에 설정된 배치관리자를 해제.
		setLayout(null);
		
		//컴포넌트의 좌표 설정.
		jlbl.setLocation(10, 40);
		jcb.setLocation(130,100);
		//컴포넌트의 크기 설정.
		jlbl.setSize(80, 30);
		jcb.setSize(120, 40);
		
		//좌표설정과 크기를 동시에 설정.
		jl.setBounds(290,40,120,100);
		
		add(jlbl);
		add(jcb);
		add(jl);
		
		//4. 윈도우 크기 설정
		setSize(500, 400);
		
		//5. 가시화
		setVisible(true);
		
		//윈도우 크기변경 막기
		setResizable(false);
		
		//6. 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}//UseManualLayout
	public static void main(String[] args) {
		new UseManualLayout();
	}//main

}//class

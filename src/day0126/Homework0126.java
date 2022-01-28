package day0126;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
//1.윈도우 컴포넌트 상속
public class Homework0126 extends JFrame {
	public Homework0126() {
		super("사원관리");
		//2.컴포넌트 생성
		JLabel jlblNumber = new JLabel("번호");
		JTextField jtfNumber = new JTextField(10);
		
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		
		JLabel jlblGender = new JLabel("성별");
		JRadioButton jrbM = new JRadioButton("남");
		JRadioButton jrbF = new JRadioButton("여");
		
		JLabel jlblEmail = new JLabel("이메일");
		JTextField jtfEmail = new JTextField(10);
		
		JTextArea jta = new JTextArea();
		
		JButton plus = new JButton("추가");
		JButton del = new JButton("삭제");
		JButton chg = new JButton("변경");
		JButton exit = new JButton("닫기");
		
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbM);
		bg.add(jrbF);
		
		jta.setBorder(new TitledBorder("데이터"));
		
		//3.배치
		setLayout(null);
	
		add(jlblNumber);
		add(jtfNumber);
		add(jlblName);
		add(jtfName);
		
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		
		add(jlblEmail);
		add(jtfEmail);
		
		add(jta);
		
		add(plus);
		add(del);
		add(chg);
		add(exit);
	
		
		//좌표, 크기 설정
		jlblNumber.setBounds(10, 15, 100, 10);
		jtfNumber.setBounds(50, 10, 100, 20);
		
		jlblName.setBounds(10, 40, 100, 20);
		jtfName.setBounds(50, 40, 100, 20);
		
		jlblGender.setBounds(10, 65, 100, 20);
		jrbM.setBounds(50, 65, 40, 20);
		jrbF.setBounds(110, 65, 40, 20);
		
		jlblEmail.setBounds(10, 90, 100, 20);
		jtfEmail.setBounds(50, 90, 100, 20);
		
		jta.setBounds(180, 15, 150, 100);
		
		plus.setBounds(45, 120, 60, 25);
		del.setBounds(110, 120, 60, 25);
		chg.setBounds(175, 120, 60, 25);
		exit.setBounds(240, 120, 60, 25);
		
		
		//4.윈도우 크기 설정
		setSize(360, 200);
		
		//5.가시화
		setVisible(true);
		
		//6.종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Homework0126();
	}//main

}//class

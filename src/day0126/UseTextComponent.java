package day0126;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseTextComponent extends JFrame {
	
	public UseTextComponent() {
		super("TextComponent연습");
		
		JTextField jtf = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JTextArea jta = new JTextArea();
		
		//글꼴 변경.
		jtf.setFont(new Font("휴먼편지체",Font.BOLD,20));
		jta.setFont(new Font("궁서체",Font.ITALIC|Font.BOLD,25));
		
		//반향문자 설정.
		jpf.setEchoChar('*');
		//JTA를 줄 단위로 바꿈.(자동 줄바꿈)
		jta.setLineWrap(true);
		//JTA를 단어 보호 옵션.(한글 x)
		jta.setWrapStyleWord(true);
		
		//JTextArea는 ScrollBar가 없으므로 JScrollBar를 구현한 JScrollPane과 has a관게를 설정한 후
		JScrollPane jsp = new JScrollPane(jta);
		
		//border설정
		jtf.setBorder(new TitledBorder("이름"));
		jpf.setBorder(new TitledBorder("나이"));
		jsp.setBorder(new TitledBorder("출력"));
		
		//배치
		setLayout(null);
		
		//좌표, 크기설정
		jtf.setBounds(20, 30, 200, 50);
		jpf.setBounds(20, 100, 200, 50);
//		jta.setBounds(20, 170, 200, 200); 
		jsp.setBounds(20, 170, 200, 200);//JTextArea가 아닌 JTA를 가진 JSP의 크기와 위치를 설정한다. 
		
		
		
		//배치
		add(jtf);
		add(jpf);
		//JTextArea를 가진 JScrollPane을 배치한다.
		add(jsp);
		
		//윈도우 크기설정
		setBounds(100, 100, 250, 460);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseTextComponent
	public static void main(String[] args) {
		new UseTextComponent();
	}//main

}//class

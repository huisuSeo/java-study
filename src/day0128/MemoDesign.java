package day0128;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoDesign extends JFrame {
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiSave2, jmiClose, jmiFont, jmiHelp;
	public MemoDesign() {
		super("메모장");
		
		JMenuBar jmb = new JMenuBar();
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		JMenu jm = new JMenu("파일");
		JMenu jm1 = new JMenu("서식");
		JMenu jm2 = new JMenu("도움말");
		
		jmiNew = new JMenuItem("새글");
		jmiOpen = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiSave2 = new JMenuItem("다른 이름으로 저장");
		jmiClose = new JMenuItem("닫기");
		jmiFont = new JMenuItem("글꼴");
		jmiHelp = new JMenuItem("메모장 정보");	
		
		jm.add(jmiNew);
		jm.add(jmiOpen);
		jm.add(jmiSave);
		jm.add(jmiSave2);
		jm.add(jmiClose);
		jm1.add(jmiFont);
		jm2.add(jmiHelp);
		
		jmb.add(jm);
		jmb.add(jm1);
		jmb.add(jm2);
		
		setJMenuBar(jmb);
		
		jmb.setBounds(0,0,20,);
		jsp.setBounds(50,100,400,400);
		
		add(jmb);
		add(jsp);
		
		
		MemoEvt me = new MemoEvt(this);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//MemoDesign
	public static void main(String[] args) {
		new MemoDesign();
	}//main

}//class

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
		super("�޸���");
		
		JMenuBar jmb = new JMenuBar();
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		JMenu jm = new JMenu("����");
		JMenu jm1 = new JMenu("����");
		JMenu jm2 = new JMenu("����");
		
		jmiNew = new JMenuItem("����");
		jmiOpen = new JMenuItem("����");
		jmiSave = new JMenuItem("����");
		jmiSave2 = new JMenuItem("�ٸ� �̸����� ����");
		jmiClose = new JMenuItem("�ݱ�");
		jmiFont = new JMenuItem("�۲�");
		jmiHelp = new JMenuItem("�޸��� ����");	
		
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

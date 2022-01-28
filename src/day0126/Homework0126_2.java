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
public class Homework0126_2 extends JFrame {
	public Homework0126_2() {
		super("사원관리");
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
		
		JPanel jpWest = new JPanel();
		JPanel rb = new JPanel();
		JPanel jpCenter = new JPanel();
		JPanel jpSouth = new JPanel();
		
		//west
		GridLayout grid = new GridLayout(4,2);
		jpWest.setLayout(grid);
		
		jpWest.add(jlblNumber);
		jpWest.add(jtfNumber);
		
		jpWest.add(jlblName);
		jpWest.add(jtfName);
		
		jpWest.add(jlblGender);
		rb.add(jrbM);
		rb.add(jrbF);
		jpWest.add(rb);
		
		jpWest.add(jlblEmail);
		jpWest.add(jtfEmail);
		add("West",jpWest);
		
		
		//center
		jpCenter.add(jta);
		GridLayout grid2 = new GridLayout(1,1);
		jpCenter.setLayout(grid2);
		add("Center",jpCenter);
		
	
		jpSouth.add(plus);
		jpSouth.add(del);
		jpSouth.add(chg);
		jpSouth.add(exit);
		GridLayout grid3 = new GridLayout(1,4);
		jpSouth.setLayout(grid3);
		add("South",jpSouth);
		
		
		setSize(400, 300);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Homework0126_2();
	}

}

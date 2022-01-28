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
		super("�������");
		JLabel jlblNumber = new JLabel("��ȣ");
		JTextField jtfNumber = new JTextField(10);
		
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10);
		
		JLabel jlblGender = new JLabel("����");
		JRadioButton jrbM = new JRadioButton("��");
		JRadioButton jrbF = new JRadioButton("��");
		
		JLabel jlblEmail = new JLabel("�̸���");
		JTextField jtfEmail = new JTextField(10);
		
		JTextArea jta = new JTextArea();
		
		JButton plus = new JButton("�߰�");
		JButton del = new JButton("����");
		JButton chg = new JButton("����");
		JButton exit = new JButton("�ݱ�");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbM);
		bg.add(jrbF);
		
		jta.setBorder(new TitledBorder("������"));
		
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

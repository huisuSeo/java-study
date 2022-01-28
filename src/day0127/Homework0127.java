package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Homework0127 extends JFrame implements ActionListener{
	
	private JComboBox<String> jcb;
	private JTextField jtf;
	
	public Homework0127() {
		super("사원관리");
		
		jcb = new JComboBox<String>();
		jcb.addItem("Java");
		jcb.addItem("Oracle");
		jcb.addItem("JDBC");
		jcb.addItem("HTML");
		
		JLabel jl = new JLabel("선택아이템");
		
		jtf = new JTextField(10);
		
		JPanel jpWest = new JPanel();
		JPanel jpCenter = new JPanel();
		
		jcb.addActionListener(this);
		
		jpWest.add(jcb);
		jpCenter.add(jl);
		jpCenter.add(jtf);
		
		add("West",jpWest);
		add("Center",jpCenter);
		
		
		setSize(300, 170);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Homework0127
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String txt = jcb.getSelectedItem().toString();
		jtf.setText(txt);
	}
	public static void main(String[] args) {
		new Homework0127();
	}//main

}//class

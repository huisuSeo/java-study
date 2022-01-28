package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//1¹ø¼÷Á¦¸¦ ±î¸Ô¾ú½À´Ï´Ù.. ³×
@SuppressWarnings("serial")
public class Homework0125 extends JFrame {
	public Homework0125() {
		super("0125 ¼÷Á¦");
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");
		JButton jbt4 = new JButton("4");
		JButton jbt5 = new JButton("5");
		JButton jbt6 = new JButton("6");
		JButton jbt7 = new JButton("7");
		JButton jbt8 = new JButton("8");
		JButton jbt9 = new JButton("9");
		JButton jbtStar = new JButton("*");
		JButton jbt0 = new JButton("0");
		JButton jbtSharp = new JButton("#");
		
		setLayout(new GridLayout(4,3));
		add(jbt1);
		add(jbt2);
		add(jbt3);
		add(jbt4);
		add(jbt5);
		add(jbt6);
		add(jbt7);
		add(jbt8);
		add(jbt9);
		add(jbtStar);
		add(jbt0);
		add(jbtSharp);
		
		setSize(300, 400);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Homework0125();
	}

}

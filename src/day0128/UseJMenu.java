package day0128;

import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame {
	
	//3.�޴������� ����
	private JMenuItem jmiNew, jmiDialog, jmiClose, jmiHelp;
	
	public UseJMenu() {
	super("�޴�����");	
	
	//1. �޴��ٸ� ����
	JMenuBar jmb = new JMenuBar();
	
	//2. �޴� ����.
	JMenu jm = new JMenu("�޴�1");
	JMenu jm2 = new JMenu("�޴�2");
	
	//�޴������� ����
	jmiNew = new JMenuItem("�޴�������");
	jmiDialog = new JMenuItem("���̾�α�");
	jmiClose = new JMenuItem("�ݱ�");
	jmiHelp = new JMenuItem("����");
	
	//4.�޴��������� �޴��� ��ġ.
	jm.add(jmiNew);
	jm.add(jmiDialog);
	jm.addSeparator();
	jm.add(jmiClose);
	
	jm2.add(jmiHelp);
	
	//5. �޴��� �޴��ٿ� ��ġ
	jmb.add(jm);
	jmb.add(jm2);
	
	//6. �޴��ٸ� �����ӿ� ��ġ
	setJMenuBar(jmb);
	
	//�޴������� �̺�Ʈ ���.
	//has a
	UseJMenuEvt ujme = new UseJMenuEvt(this);
	jmiDialog.addActionListener(ujme);
	jmiClose.addActionListener(ujme);
	
	setSize(800, 600);
	
	setVisible(true);
	
	}//UseJMenu
	
	
	
	
	public JMenuItem getJmiNew() {
		return jmiNew;
	}




	public void setJmiNew(JMenuItem jmiNew) {
		this.jmiNew = jmiNew;
	}




	public JMenuItem getJmiDialog() {
		return jmiDialog;
	}




	public void setJmiDialog(JMenuItem jmiDialog) {
		this.jmiDialog = jmiDialog;
	}




	public JMenuItem getJmiClose() {
		return jmiClose;
	}




	public void setJmiClose(JMenuItem jmiClose) {
		this.jmiClose = jmiClose;
	}




	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}




	public void setJmiHelp(JMenuItem jmiHelp) {
		this.jmiHelp = jmiHelp;
	}




	public static void main(String[] args) {
		new UseJMenu();
	}//main

}//class

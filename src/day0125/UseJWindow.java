package day0125;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * Window�� ��ӹ�����, ������Ʈ�� �����̳� ������Ʈ�� ��ġ�Ͽ� �����ֱ� ����
 * JFrame�� �ʿ��ϴ�.
 * @author user
 *
 */
@SuppressWarnings("serial")
public class UseJWindow extends JWindow{

	public UseJWindow(JFrame jf) {
		super(jf);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		new UseJWindow(jf);
	}//main

}//class

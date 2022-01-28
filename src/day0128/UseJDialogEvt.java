package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * 다이얼로그의 이벤트 처리
 * @author user
 *
 */
public class UseJDialogEvt extends WindowAdapter implements ActionListener {

	private UseJDialog ujd;
	
	public UseJDialogEvt(UseJDialog ujd) {
		this.ujd = ujd;
	}
	
	
	@Override
	public void windowClosing(WindowEvent we) {
		//종료작업 때 일을 더 할 수 있다.
		ujd.dispose();
	}//windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		ujd.dispose();
	}//actionPerformed

}//class

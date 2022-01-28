package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class MemoEvt extends WindowAdapter implements ActionListener {
	private MemoDesign md;
	
	public MemoEvt(MemoDesign md) {
		this.md = md;
	}//MenuEvt
	
	@Override
	public void actionPerformed(ActionEvent e) {
		md.dispose();
	}//actionPerformed

}//class

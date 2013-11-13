package original;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton implements ActionListener{
	
	ImageIcon X,O;
	byte value=0;
	/*
	 * 0:nothing
	 * 1:X
	 * 2:O
	*/
	
	public XOButton(){
		X=new ImageIcon("/Users/mitchcail/Documents/projects/TicTacToe/src/original/RedX.png");
		O=new ImageIcon("/Users/mitchcail/Documents/projects/TicTacToe/src/original/o.png");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		value++;
		value%=3;
		switch(value){
			case 0:
				setIcon(null);
				break;
			case 1:
				setIcon(X);
				break;
			case 2:
				setIcon(O);
				break;
			
		}
		
	}
}

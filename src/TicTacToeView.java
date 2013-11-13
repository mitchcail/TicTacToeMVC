
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import original.XOButton;

public class TicTacToeView extends JFrame implements Observer{
	JPanel p = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	
	
	TicTacToeModel observed = new TicTacToeModel();
	TicTacToeController buttons[] = new TicTacToeController[9];
	
	public static void main(String args[]){
		TicTacToeView view = new TicTacToeView();
		TicTacToeModel model = new TicTacToeModel();
		TicTacToeController controller = new TicTacToeController(view, model);
	}
	
	public TicTacToeView(){
		super("Tic Tac Toe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(button4);
		p.add(button5);
		p.add(button6);
		p.add(button7);
		p.add(button8);
		p.add(button9);
		add(p);
		
		setVisible(true);
		
	}
	

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Player "+ observed.current_player);
		
	}

	
	
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToeController implements ActionListener{
	private TicTacToeView view;
	private TicTacToeModel model;
	
	public TicTacToeController(TicTacToeView view, TicTacToeModel model) {
		this.view = view;
		this.model = model;
		
		view.button1.addActionListener(this);
		view.button2.addActionListener(this);
		view.button3.addActionListener(this);
		view.button4.addActionListener(this);
		view.button5.addActionListener(this);
		view.button6.addActionListener(this);
		view.button7.addActionListener(this);
		view.button8.addActionListener(this);
		view.button9.addActionListener(this);
	}

	public void actionPerformed(ActionEvent a){
		if(a.getSource() == view.button1){
			model.playerMove(0,0);
			if(model.current_player == 1)
				view.button1.setText("X");
			else{
				view.button1.setText("O");
			}
		} else if(a.getSource() == view.button2){
			model.playerMove(0,1);
			if(model.current_player == 1)
				view.button2.setText("X");
			else{
				view.button2.setText("O");
			}
		} else if(a.getSource() == view.button3){
			model.playerMove(0,2);
			if(model.current_player == 1)
				view.button3.setText("X");
			else{
				view.button3.setText("O");
			}
		} else if(a.getSource() == view.button4){
			model.playerMove(1,0);
			if(model.current_player == 1)
				view.button4.setText("X");
			else{
				view.button4.setText("O");
			}
		} else if(a.getSource() == view.button5){
			model.playerMove(1,1);
			if(model.current_player == 1)
				view.button5.setText("X");
			else{
				view.button5.setText("O");
			}
		} else if(a.getSource() == view.button6){
			model.playerMove(1,2);
			if(model.current_player == 1)
				view.button6.setText("X");
			else{
				view.button6.setText("O");
			}
		} else if(a.getSource() == view.button7){
			model.playerMove(2,0);
			if(model.current_player == 1)
				view.button7.setText("X");
			else{
				view.button7.setText("O");
			}
		} else if(a.getSource() == view.button8){
			model.playerMove(2,1);
			if(model.current_player == 1)
				view.button8.setText("X");
			else{
				view.button8.setText("O");
			}
		} else if(a.getSource() == view.button9){
			model.playerMove(2,2);
			if(model.current_player == 1)
				view.button9.setText("X");
			else{
				view.button9.setText("O");
			}
		}
		model.player_turn++;
	}
	
		
	
}

import java.util.ArrayList;
import java.util.Observable;

// make an observable
public class TicTacToeModel extends Observable{
	
	
	int[][] board;
	int player_turn = 0;
	int current_player =1 ; //1=O, 2=X, 3=EMPTY
	int size_of_board = 3;
	boolean winner = false;
	
	TicTacToeModel(){
		createBoard();
		printBoard();
	}
	
	public void createBoard(){
		board = new int[size_of_board][size_of_board];
		printBoard();
		//nested for loop
	}
	
	private void printBoard(){
		System.out.println("-------------------------");
		for(int x=0;x<size_of_board;x++){
			
			for(int y=0;y<size_of_board;y++){
				System.out.print(board[x][y]);
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------");
	}
	
	
	// position of players move
	public void playerMove(int x, int y){
		if(player_turn%2 == 0){
			current_player = 1;
		}
		else{
			current_player = 2;
		}
		
		if(board[x][y] == 0){	
			board[x][y] = current_player;
			printBoard();
		}else{
			System.out.println("illegal move");
		}
		
		checkWinner();
	}
	
	private void checkWinner(){
		//horizontalwinner
		if(board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2){
			winner = true;
			System.out.println("O wins");
		}
		if(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2){
			winner = true;
			System.out.println("O wins");
		}
		if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2){
			winner = true;
			System.out.println("O wins");
		}
		
		//Vertical
		if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2){
			winner = true;
			System.out.println("O wins");
		}
		if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2){
			winner = true;
			System.out.println("O wins");
		}
		if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
			winner = true;
			System.out.println("X wins");
		}
		if(board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2){
			winner = true;
			System.out.println("O wins");
		}
		
		//Diagonal
		if(board[0][0]==1 && board[1][1]==1 && board[2][2]==1){
			System.out.println("X wins");
		}
		if(board[0][0]==2 && board[1][1]==2 && board[2][2]==2){
			System.out.println("O wins");
		}
	}
}

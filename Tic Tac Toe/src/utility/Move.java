package utility;

import entity.Cell;
import entity.GameBoard;
import entity.Seed;
import entity.User;

public class Move {
	
	private User player;
	private Cell cell;
	private GameBoard board;
	private User winner;
  
	public Move(User player, Cell cell, GameBoard board) {
		super();
		this.player =  player;
		this.cell = cell;
		this.board = board;
		fillCell();
	}

	private void fillCell() {
		// TODO Auto-generated method stub
		this.cell.setContent(player.getseedType());
		System.out.println(this.player.getUserName()+"  current move is : "+player.getseedType().name() +" in "+(cell.getRow()+1) +" ,"+ (cell.getCol()+1) );		 
		boolean winner=setWinner();
		System.out.println(winner+" set flag"+this.winner);
	}

	public User getWinner() {
		return winner;
	}

	private boolean setWinner() {
		// TODO Auto-generated method stub

		boolean winner=true;
		Cell[][] cells=board.getCells(); 
		int currentRow=cell.getRow();
		int currentCol=cell.getCol();
		
		for(int i=0 ; i<board.getCOLS() ; i++ ) {
			if(!(cells[currentRow][i].getContent()==player.getseedType() )) { winner=false; break; }
		}
		if(winner) { this.winner=this.player; return true;}
		
		winner=true;
		for(int i=0 ; i<board.getROWS() ; i++ ) {
			if(!cells[i][currentCol].getContent().equals(player.getseedType())) { winner=false; break; }
		}
		if(winner) { this.winner=this.player; return true;}
		
		winner=true;
		for(int i=0; i< board.getROWS() ; i++) {
			if(!cells[i][i].getContent().equals(player.getseedType())) { winner=false; break; }
		}
		if(winner) { this.winner=this.player; return true;}
		
		winner=true;
		for(int i=0; i< board.getROWS() ; i++) {
			if(!cells[i][board.getROWS()-i-1].getContent().equals(player.getseedType())) { winner=false; break; }
		}
		if(winner) { this.winner=this.player; return true;}
		
		return false;
	}
	
	 public static void init(GameBoard board) {
		  Cell[][] cells=board.getCells(); 
	      for (int row = 0; row <board.getROWS() ; ++row) {
	         for (int col = 0; col < board.getCOLS(); ++col) {
	            cells[row][col].clear();  // clear the cell content
	         }
	      }
	   }
  
  
}

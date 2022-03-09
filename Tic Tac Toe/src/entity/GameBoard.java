package entity;
public class GameBoard {


	private  final int ROWS;
	private  final int COLS;
	
	private Cell[][] cells;  // a board composes of ROWS-by-COLS Cell instances
	
	 /** Constructor to initialize the game board */
	 public GameBoard(int ROWS,int COLS){
		 this.ROWS=ROWS;
		 this.COLS=COLS;
		 cells=new Cell[ROWS][COLS];
		 for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	        	 cells[row][col]=new Cell(row,col);
	         }
	     }    
	 }
	   

	 public int getROWS() {
		return ROWS;
	}


	public int getCOLS() {
		return COLS;
	}


	public Cell[][] getCells() {
		return cells;
	}

	   
}

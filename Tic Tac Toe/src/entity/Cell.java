package entity;

public class Cell {
	private Seed content;
	private int row;
	private int col;
	public Cell( int row, int col) {
		super();
		this.row = row;
		this.col = col;
		clear();
	}
	
	public void clear() {
		content=Seed.EMPTY;
	}

	public Seed getContent() {
		return content;
	}

	public void setContent(Seed content) {
		this.content = content;
	}

	public int getRow() {
		return row;
	}


	public int getCol() {
		return col;
	}


	

	 
}

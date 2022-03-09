import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import entity.Cell;
import entity.GameBoard;
import entity.Player;
import entity.Seed;
import entity.User;
import utility.Move;
import utility.Paint;

public class PlayGame {
	
	public static boolean checkWinner(User winner) {
		if(winner!=null) {
	    	   System.out.println(winner.getUserName()+" is Winner ");
	    	   return true;
	       }
		return false;
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
       User p1=new Player(123,"bhim",Seed.CROSS);
       User p2=new Player(1231,"verma",Seed.NOUGHT);
       Queue<User> q=new LinkedList<>();
       q.offer(p1);
       q.offer(p2);
       User winner=null;
       User currentPlayer=null;
       List<Move> moves=new LinkedList<>();
       GameBoard board=new GameBoard(3,3);
       Cell[][] cells=board.getCells();
       boolean check=true;
       printBoard(board);
       while(!checkWinner(winner)){
    	  if(check) currentPlayer=q.poll();
    	  
    	  //take input cell from current user row,col
    	   System.out.println(currentPlayer.getUserName()+" please enter row number !!");
    	   int row=sc.nextInt();
    	   System.out.println(currentPlayer.getUserName()+" please enter column number !!");
    	   int col=sc.nextInt();
    	   if(!cells[row-1][col-1].getContent().equals(Seed.EMPTY) ||(row<0 || row>board.getROWS() || col<0 || col>board.getCOLS())) {check=false;  System.out.println("current cell is filled already please select correct row and column"); continue;}
    	   check=true;
    	   Move m=new Move(currentPlayer,cells[row-1][col-1],board);
    	   moves.add(m);
    	   winner=m.getWinner();
    	   q.offer(currentPlayer); 
    	   System.out.println(winner+ " winner");
    	   printBoard(board);
    	   Thread.sleep(1000);
       }
       
	}



	private static void printBoard(GameBoard board) {
		// TODO Auto-generated method stub
		Cell[][] cells=board.getCells();
		
		for(int i=0; i< board.getROWS() ; i++ ) {
			for(int j=0 ; j<board.getCOLS() ; j++) {
				System.out.print( Paint.paint(cells[i][j])+"  " );
			}
			System.out.println("");
		}
	}

}

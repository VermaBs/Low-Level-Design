package utility;
import entity.Cell;

public class Paint {

	public static String paint(Cell cell) {
		
		switch(cell.getContent()) {
			 case CROSS:  return "X"; 
	         case NOUGHT: return "O";
	         case EMPTY:  return "N";
		}
		return null;
	}
}

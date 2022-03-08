package classes;

public class Door {
  private boolean isOpen;
  
  public Door(boolean isOpen) {
	super();
	this.isOpen = isOpen;
}

  public boolean openTheDoor() {
	 return  this.isOpen=true;
  }
  
  public boolean closeTheDoor() {
	  return  this.isOpen=false;
  }
}

package entity;

public class Player implements User {
    private int userId;
    private String userName;
    private Seed seedType;
    
    public Player(int userId,String userName,Seed seedType){
    	this.userId=userId;
    	this.userName=userName;
    	this.seedType=seedType;
    }
    
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}
	
	public Seed getseedType() {
		return seedType;
	}

	@Override
	public User getPlayer(int playerId) {
		// TODO Auto-generated method stub
		return this;
	}

}

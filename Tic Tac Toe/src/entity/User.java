package entity;

public interface User {
	public User getPlayer(int playerId);
	public String getUserName();
	public int getUserId();
	public Seed getseedType();
}


public class VideoPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Resolution resolution480=new Resolution480p();
        Resolution resolution720=new Resolution720p();
        Device deviceTV=new TV();
        
        VideoPlayer player=new VideoPlayerImpl(deviceTV,resolution720);
        player.display();
        
        Device devicePhone=new Phone();
        VideoPlayer player1=new VideoPlayerImpl(devicePhone,resolution480);
        player1.display();
	}

}


public class VideoPlayerImpl extends VideoPlayer {

	VideoPlayerImpl(Device device,Resolution resolution){
		this.currentDevice=device;
		this.currentResolution=resolution;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		this.getDevice();
		this.getResolution();
	}

}

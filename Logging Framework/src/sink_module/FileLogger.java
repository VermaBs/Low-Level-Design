package sink_module;

public class FileLogger implements LogObserver{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("FILE MESSAGE : "+ message);
	}
}

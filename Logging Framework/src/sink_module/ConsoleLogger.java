package sink_module;

public class ConsoleLogger implements LogObserver{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("CONSOLE MESSAGE : "+ message);
	}

}

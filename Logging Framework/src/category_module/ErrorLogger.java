package category_module;

import sink_module.LoggerSubject;

public class ErrorLogger extends AbstractLogger {
    
	public ErrorLogger(int level) {
        this.level = level;
    }
	
	@Override
	protected void display(String msg, LoggerSubject loggerSubject) {
		// TODO Auto-generated method stub
		//System.out.println("Error  : "+msg);
		String str="Error  : "+msg;
		loggerSubject.notifyAllObserver(level, str);
	}
}

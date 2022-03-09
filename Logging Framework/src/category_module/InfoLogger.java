package category_module;

import sink_module.LoggerSubject;

public class InfoLogger extends AbstractLogger {
	
	public InfoLogger(int level) {
        this.level = level;
    }
	@Override
	protected void display(String msg, LoggerSubject loggerSubject) {
		// TODO Auto-generated method stub
		//System.out.println("Info  : "+msg);
		String str="Info  : "+msg;
		loggerSubject.notifyAllObserver(level, str);
	}

}

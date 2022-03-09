package category_module;

import sink_module.LoggerSubject;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }
    

	@Override
	protected void display(String msg, LoggerSubject loggerSubject) {
		// TODO Auto-generated method stub
		//System.out.println("Debug  : "+msg);
		String str="Debug  : "+msg;
		loggerSubject.notifyAllObserver(level, str);
	}
}

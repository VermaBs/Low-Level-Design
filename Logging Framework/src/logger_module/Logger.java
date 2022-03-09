package logger_module;

import java.io.Serializable;

import category_module.AbstractLogger;
import sink_module.LogManager;
import sink_module.LoggerSubject;

public class Logger implements Serializable,Cloneable {
  
	  private static final AbstractLogger chainOfLogger=LogManager.doChaining();
	  private static final LoggerSubject loggerSubject = LogManager.addObservers();
	 
	   private Logger() { }
       static class InnerLogger{
    	   private static final Logger logger=new Logger();
       }
       public static Logger getLogger() {
    	   return InnerLogger.logger;
       }
	    
	    protected Object clone() throws CloneNotSupportedException {
	        throw new CloneNotSupportedException();
	    }

	    protected Object readResolve() {
	        return getLogger();
	    }

	    private void createLog(int level, String message){
	        chainOfLogger.logMessage(level, message, loggerSubject);
	    }
	    
	    public void info(String message) {
	        createLog(1, message);
	    }
	    public void error(String message) {
	        createLog(2, message);
	    }
	    public void debug(String message) {
	        createLog(3, message);
	    }

}

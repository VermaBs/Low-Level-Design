package category_module;

import sink_module.LoggerSubject;

public abstract class AbstractLogger {
  protected int level;
  private AbstractLogger nextLevelLogger;
    
  public void setNextLevelLogger(AbstractLogger nextLevelLogger) {
      this.nextLevelLogger = nextLevelLogger;
  }

   public void logMessage(int level, String msg, LoggerSubject loggerSubject){
      if(this.level<=level){
          display(msg, loggerSubject);
      }

      if (nextLevelLogger!=null) {
          nextLevelLogger.logMessage(level, msg, loggerSubject);
      }
  }
  protected abstract void display(String msg, LoggerSubject loggerSubject);
}

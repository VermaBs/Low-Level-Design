package sink_module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerSubject {
	Map<Integer, List<LogObserver>> logObservers = new HashMap<>();
	
	public void addObserver(int level,LogObserver logObserver) {
		List<LogObserver> currentLogger = logObservers.getOrDefault(level, new ArrayList<>());
		currentLogger.add(logObserver);
		this.logObservers.put(level, currentLogger);
	}
	
	public void removeObserver(LogObserver logObserver){
		for(Map.Entry<Integer,List<LogObserver>> logObserverList: this.logObservers.entrySet() ) {
			logObserverList.getValue().remove(logObserver);
		}
	}
	
	public void notifyAllObserver(int level, String message){
		 for(Map.Entry<Integer, List<LogObserver>> logObserverList : this.logObservers.entrySet()) {
			 if(logObserverList.getKey()==level) {
				 //System.out.println(logObserverList.getValue().size()+"  SIZE");
				logObserverList.getValue().forEach(observer->observer.log(message));
			 }
		 }
	 }

}

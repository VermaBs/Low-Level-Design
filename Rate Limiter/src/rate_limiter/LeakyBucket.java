package rate_limiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucket implements RateLimiter {
	private BlockingQueue<Integer> queue;

	public LeakyBucket(int capacity) {
		super();
		queue=new LinkedBlockingQueue<>(capacity);
	}

	@Override
	public boolean grantAccess() {
		// TODO Auto-generated method stub
		if(queue.remainingCapacity()>0) {
			queue.add(1);
			return true;
		}
		else return false;
	}
	
	

}

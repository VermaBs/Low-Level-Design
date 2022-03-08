package rate_limiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {

	private int bucketCapacity;
	private int refreshRate;//token per seconds
	private AtomicInteger currentCapacity;
	private AtomicLong lastUpdatedTime;
	
	public TokenBucket(int bucketCapacity, int refreshRate) {
		super();
		this.bucketCapacity = bucketCapacity;
		this.refreshRate = refreshRate;
		this.currentCapacity=  new AtomicInteger(bucketCapacity);
		this.lastUpdatedTime=new AtomicLong(System.currentTimeMillis());
	}

	@Override
	public boolean grantAccess() {
		// TODO Auto-generated method stub
		refreshBucket();
		if(this.currentCapacity.get()>0) {
			this.currentCapacity.decrementAndGet();
			return true;
		}
		return false;
	}

	private void refreshBucket() {
		// TODO Auto-generated method stub
		long currentTime=System.currentTimeMillis();
		int additionToken=(int)((currentTime-this.lastUpdatedTime.get())/1000)*this.refreshRate; //convert it to second because we have refresh rate in second
		int currCapacity=Math.min(currentCapacity.get()+additionToken, this.bucketCapacity);
        this.currentCapacity.getAndSet(currCapacity);
        this.lastUpdatedTime.getAndSet(currentTime);
	}
}

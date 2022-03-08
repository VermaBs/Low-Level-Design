package bucketCreator;

import java.util.HashMap;
import java.util.Map;

import rate_limiter.LeakyBucket;
import rate_limiter.TokenBucket;

public class TokenUserBucketCreator {
	Map<Integer,TokenBucket> map;

	public TokenUserBucketCreator(int userId,int default_capacity,int refreshRate) {
		super();
		map=new HashMap<>();
		map.put(userId, new TokenBucket(default_capacity,refreshRate) );
	}
	
	public void accessApplication(int userId) {
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(map.get(userId).grantAccess()) {
			System.out.println(userId+" is able to access application "+Thread.currentThread().getName());
		}
		else {
			System.out.println(userId+" has too many request "+Thread.currentThread().getName());
		}
	}
}

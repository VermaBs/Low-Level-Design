package bucketCreator;

import java.util.HashMap;
import java.util.Map;


import rate_limiter.LeakyBucket;

public class LeakyUserBucketCreator {
    Map<Integer,LeakyBucket> map;

	public LeakyUserBucketCreator(int userId,int default_capacity) {
		super();
		map=new HashMap<>();
		map.put(userId, new LeakyBucket(default_capacity) );
	}
	
	public void accessApplication(int userId) {
		if(map.get(userId).grantAccess()) {
			System.out.println(userId+" is able to access application ");
		}
		else {
			System.out.println(userId+" has too many request ");
		}
	}
  
  
}

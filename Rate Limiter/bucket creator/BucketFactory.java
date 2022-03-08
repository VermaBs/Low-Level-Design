package bucketCreator;

public class BucketFactory {
    
    public static LeakyUserBucketCreator getLeakyUserBucketCreator(int userId,int capacity) {
    	 return new LeakyUserBucketCreator(userId,capacity);
    }
    
    public static TokenUserBucketCreator getTokenUserBucketCreator(int userId,int capacity,int refreshRate) {
    	return new TokenUserBucketCreator(userId,capacity,refreshRate);
    }
    
   
}

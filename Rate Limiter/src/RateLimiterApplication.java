import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import bucketCreator.BucketFactory;
import bucketCreator.LeakyUserBucketCreator;
import bucketCreator.TokenUserBucketCreator;

public class RateLimiterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LeakyUserBucketCreator leakybucketCreator=BucketFactory.getLeakyUserBucketCreator(1,10);
         TokenUserBucketCreator tokenbucketCreator=BucketFactory.getTokenUserBucketCreator(1,10,10);
         
         //for(int i=0; i<15 ; i++)
        	// leakybucketCreator.accessApplication(1);
         
         ExecutorService executor=Executors.newFixedThreadPool(10);
        
         for(int i=0; i<20 ; i++)
         executor.execute( ()->tokenbucketCreator.accessApplication(1) );
         
         executor.shutdown();
        	 
	}

}

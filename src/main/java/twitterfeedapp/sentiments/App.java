package twitterfeedapp.sentiments;


import java.util.List;


/**
 * Hello world!
 *
 */
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class App 
{
	
	public static void main( String[] args ) throws IllegalStateException, TwitterException
    {
		System.out.println("Number of Arguments : "+args.length);

		if (args.length < 1){
			System.out.println("No Arguments to search the twitter : Please enter the text with # Tags ");
			System.exit(-1);
		}
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("yOibZ44yi1BfEa3YqR5JTyp7G")
		  .setOAuthConsumerSecret("wHO4ql9KGi4TUIRL8IiHyoqFZisM4p324fviLQsR641Y2opwWI")
		  .setOAuthAccessToken("373778136-yVeFRbskxskwn4LxiHcPr8MuotZh0iW69FuqcSbp")
		  .setOAuthAccessTokenSecret("5nN3cy8PepMhwEdTbCDrgASegLPEq5GmX7xLcWpTdGOrl");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		
		// Pass the query text to Query Object. 
		try{
			Query query = new Query(args[0]);
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				
				for(Status tweet:tweets){
					System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
				}
				
			}while ((query = result.nextQuery()) != null);
			System.exit(0);			
		}catch (TwitterException te){
			
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
		}
    }
}

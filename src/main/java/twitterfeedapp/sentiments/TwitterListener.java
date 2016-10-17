package twitterfeedapp.sentiments;

import twitter4j.*;
import twitterfeedapp.sentiments.data.Tweet;
import twitterfeedapp.sentiments.queue.KafkaInitializer;

public class TwitterListener implements StatusListener{

	static final Logger logger = Logger.getLogger(App.class);
	
	
	public void onException(Exception arg0) {
		// TODO Auto-generated method stub
	
	}

	public void onDeletionNotice(StatusDeletionNotice arg0) {
		// TODO Auto-generated method stub
		logger.info("Got a status deletion notice id:" + arg0.getStatusId());
				
	}

	public void onScrubGeo(long arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onStallWarning(StallWarning arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStatus(Status arg0) {
		//logger.info("@" + arg0.getUser().getScreenName() + " - " + arg0.getText()+ " on : "+ arg0.getCreatedAt());
		
		// Prepare the Json Object to be published in Kafka Queue
		Tweet tweet = new Tweet(arg0);
		JSONObject jsonData=tweet.getTweet();
		logger.info("JSON Data : "+jsonData.toString());
		
		// Call the Kafka Published Object  and Trigger Publish request
		KafkaInitializer kfki = new KafkaInitializer(jsonData);
		
	}

	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub
		
	}

}

package twitterfeedapp.sentiments;

import twitter4j.conf.ConfigurationBuilder;

public class TwitterAuth {

	private ConfigurationBuilder cb;
	
	public ConfigurationBuilder getConfigBuilder(){
		return cb;
	}
	public TwitterAuth(){
        cb = new ConfigurationBuilder();
	cb.setDebugEnabled(true);
	cb.setOAuthConsumerKey("Enter Your Consumer Key Here");
	cb.setOAuthConsumerSecret("Enter Your Consumer Secret Here");
	cb.setOAuthAccessToken("Enter your Access Token Here");
	cb.setOAuthAccessTokenSecret("Enter your Access Token Secret Here");
	//TwitterFactory tf = new TwitterFactory(cb.build());
	//Twitter twitter = tf.getInstance();
	}

}

package twitterfeedapp.sentiments.data;

import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.Status;

public class Tweet {

	private JSONObject tweetObj;
	private Status status;
	
	public Tweet(Status arg0){
		
		this.status=arg0; 
	}
	
	public JSONObject getTweet(){
		JSONObject tweetJsonObj = new JSONObject();
		try {
			tweetJsonObj.put("user", this.status.getUser().getScreenName());
			tweetJsonObj.put("tweet", this.status.getText());
			tweetJsonObj.put("created-date", this.status.getCreatedAt());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	return tweetJsonObj;
	
	}

}

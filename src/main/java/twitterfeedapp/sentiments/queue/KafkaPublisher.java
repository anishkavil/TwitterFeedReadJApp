package twitterfeedapp.sentiments.queue;

import java.util.*;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;



public class KafkaPublisher implements Producer {

	
	public void publishData(){
		// Write here what you need to publish. 
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void close(long arg0, TimeUnit arg1) {
		// TODO Auto-generated method stub
		
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Map metrics() {
		// TODO Auto-generated method stub
		return null;
	}

	public List partitionsFor(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Future send(ProducerRecord arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Future send(ProducerRecord arg0, Callback arg1) {
		// TODO Auto-generated method stub
		return null;
	}
}

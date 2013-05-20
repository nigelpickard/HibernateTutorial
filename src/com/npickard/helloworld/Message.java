package com.npickard.helloworld;

import org.apache.log4j.Logger;

public class Message {
	static Logger logger = Logger.getLogger(Message.class);
	private Long id;
	private String text;
	private String priority;
	private Message nextMessage;
	
	public Message(){
		
	}

	public Message(String text){
		this.text = text;
	}

	public Message(String text, String priority){
		this(text);
		this.priority = priority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	
	public String toString(){
		return this.text + "(" + this.priority + ")" + (nextMessage==null ? " and there is no next message": " and next message is: " + nextMessage.toString());
	}
	
	
}

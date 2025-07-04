package com.ObserverPattern;

public class YoutubeSubscriber implements YoutubeObserver {
	private String name;
	
	public YoutubeSubscriber(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "YoutubeSubscriber [name=" + name + "]";
	}

	@Override
	public void update(String videoTitle) {
		System.out.println(name + " got notification: New video uploaded - " + videoTitle);
	}

}

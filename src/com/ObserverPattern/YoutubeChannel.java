package com.ObserverPattern;
import java.util.*;
public class YoutubeChannel {
	private List<YoutubeObserver> subscribers = new ArrayList<>();
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(YoutubeObserver subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.toString()+" Subscribed successfully!");
    }

    public void unsubscribe(YoutubeObserver subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Unsubscribed successfully!");
    }

    public void uploadVideo(String title) {
        System.out.println("Channel " + channelName + " uploaded: " + title);
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (YoutubeObserver o : subscribers) {
            o.update(title);
        }
    }
}

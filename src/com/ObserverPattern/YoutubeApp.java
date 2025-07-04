package com.ObserverPattern;

public class YoutubeApp {
	public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("TechWithAnand");

        YoutubeSubscriber user1 = new YoutubeSubscriber("Anand");
        YoutubeSubscriber user2 = new YoutubeSubscriber("Kranthi");
        YoutubeSubscriber user3 = new YoutubeSubscriber("Manoj");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Observer Pattern Explained in 5 Minutes");

        channel.unsubscribe(user2);
        channel.uploadVideo("Factory Pattern Java Tutorial");
    }
}

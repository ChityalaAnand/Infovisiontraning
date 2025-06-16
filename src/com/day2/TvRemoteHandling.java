package com.day2;

public class TvRemoteHandling extends TvRemote{
	@Override
	public void showNetFlix() {
		System.out.println("redirecting to the intalled netflix app!");
	}
	
	@Override
	public void displayJioHotstar() {
		System.out.println("redirecting to the jio hotstar!");
	}
}

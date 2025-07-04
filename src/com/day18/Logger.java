package com.day18;

public class Logger {
	  // Static variable to hold single instance
    private static Logger instance;
 
    // Private constructor to prevent instantiation
    private Logger() {}
 
    // Global access point with lazy initialization
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
 
    // Logging method
    public void log(String message) {
        System.out.println("[BANK LOG] " + message);
    }
}

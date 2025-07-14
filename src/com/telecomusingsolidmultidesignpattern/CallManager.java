package com.telecomusingsolidmultidesignpattern;

import java.time.LocalDateTime;
import java.util.*;

public class CallManager {
    private static CallManager instance;
    private Map<String, List<CallLog>> callLogs = new HashMap<>();

    private CallManager() {}

    public static synchronized CallManager getInstance() {
        if (instance == null) {
            instance = new CallManager();
        }
        return instance;
    }

    public void simulateCall(String caller, String receiver, int durationInSeconds) {
        new Thread(() -> {
            LocalDateTime start = LocalDateTime.now();
            try {
                Thread.sleep(durationInSeconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDateTime end = LocalDateTime.now();
            CallLog log = new CallLog(caller, receiver, start, end);
            callLogs.computeIfAbsent(caller, k -> new ArrayList<>()).add(log);
        }).start();
    }

    public Map<String, List<CallLog>> getCallLogs() {
        return callLogs;
    }
}

package com.telecomusingsolidmultidesignpattern;
import java.time.LocalDateTime;

public class CallLog {
    private String caller;
    private String receiver;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CallLog(String caller, String receiver, LocalDateTime startTime, LocalDateTime endTime) {
        this.caller = caller;
        this.receiver = receiver;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getDurationInMinutes() {
        return java.time.Duration.between(startTime, endTime).toMinutes();
    }

    // Getters
}

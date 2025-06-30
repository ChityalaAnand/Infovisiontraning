package com.TelecomCustomerCallRecordsAnalyzer;

import java.time.Duration;
import java.time.LocalDateTime;

public class CallRecord {
	private String caller;
	private String receiver;
	private String operator;
	private String location;
	private LocalDateTime start;
	private LocalDateTime end;

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
	}

	@Override
	public String toString() {
		return "CallRecord [caller=" + caller + ", receiver=" + receiver + ", operator=" + operator + ", location="
				+ location + ", start=" + start + ", end=" + end + "]";
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public CallRecord(String caller, String receiver, LocalDateTime start, LocalDateTime end, String operator,
			String location) {
		super();
		this.caller = caller;
		this.receiver = receiver;
		this.operator = operator;
		this.location = location;
		this.start = start;
		this.end = end;
	}

	public long getDuration() {
		return Duration.between(start, end).getSeconds();
	}
	

}

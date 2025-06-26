package com.day13;

public class Student {
	private String name;
	private long rank;
	
	public Student(String name, long rank) {
		this.name = name;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRank() {
		return rank;
	}

	public void setRank(long rank) {
		this.rank = rank;
	}
}

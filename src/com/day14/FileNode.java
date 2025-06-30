package com.day14;
import java.util.*;
public class FileNode {
	String name;
	List<FileNode> children;

	public FileNode(String name) {
		super();
		this.name = name;
		this.children = new ArrayList<>();
	}

	public void addChild(FileNode child) {
		children.add(child);
	}

	public void print(String prefix) {
		System.out.println(prefix + name);
		for (FileNode child : children) {
			child.print(prefix + " ");
		}
	}

}

package com.day14;
public class FileSystemTree {
	public static void main(String[] args) {
		FileNode root = new FileNode("Root");
		FileNode doc = new FileNode("Documents");
		doc.addChild(new FileNode("Core java.docx"));
		doc.addChild(new FileNode("Data structure.docx"));
		doc.addChild(new FileNode("Bank App.java"));

		root.addChild(doc);
		root.print(" ");

}
}

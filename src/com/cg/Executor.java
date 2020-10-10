package com.cg;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Linked List Problem!!!");
		
		Node<Integer> firstNode = new Node<>(56);
    	Node<Integer> secondNode = new Node<>(30);
    	Node<Integer> thirdNode = new Node<>(70);
    	
    	firstNode.setNext(secondNode);
    	secondNode.setNext(thirdNode);
	}
}

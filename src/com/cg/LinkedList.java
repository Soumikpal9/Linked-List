package com.cg;

public class LinkedList {
	public INode head;
	public INode tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printLinkedList() {
		INode tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.getKey() + " -> ");
			tempNode = tempNode.getNext(); 
		}
		System.out.println();
	}
}

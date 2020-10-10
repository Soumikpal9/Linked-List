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
	
	public void append(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void addMiddle(INode newNode) {
		int size = sizeOfLinkedList();
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			int count = 0;
			INode tempNode = head;
			while(count < (size+1)/2 - 1) {
				tempNode = tempNode.getNext();
				count++;
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}
	
	public int sizeOfLinkedList() {
		INode tempNode = head;
		int size = 0;
		while(tempNode != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
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

package com.practiceProgram;

public class LinkedListUC2 {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}


	public void addNode(int data) {
		Node newNode= new Node (data);
		//
		//		if(head == null) {
		//			head = newNode;
		//			tail = newNode;
		//		}
		//		else {
		//			tail.next = newNode;
		//			tail = newNode;
		//			
		//		}

		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;

		} else {
			Node tempNode = this.head;
			this.head =newNode;
			this.head.setNext(tempNode);
		}

	}

	public void display() {
		Node tempNode = head;
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Singly LinkedList of Node");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListUC2 list = new LinkedListUC2();

		list.addNode(70);
		list.addNode(30);
		list.addNode(56);

		list.display();
	}
}



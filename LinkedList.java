package com.practiceProgram;

public class DeleteLastUC6 {

	public  Node head = null;
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

		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;

		}
	}

	public Node DeletLastNode() {
		if (head == null || head.next == null) {
		return null;
	}
		Node secondlast = head;
		while (secondlast.next.next != null) 
			secondlast = secondlast.next;
			secondlast.next = null;
			return head;
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
		DeleteLastUC6 list = new DeleteLastUC6();

		list.addNode(56);
		list.addNode(30);
		list.addNode(70);

		list.display();

		list.DeletLastNode();

		System.out.println("After Delete of the list");
		list.display();
	}

}

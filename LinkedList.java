package com.practiceProgram;

public class SearchUC7 {

	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		 Node(int data) {
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

		}
	}

	public boolean search(Node head, int x) {
		if(head == null)
		return false;

		if(head.data == x)
			return true;
		
		return search(head.next,x);
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
		SearchUC7 list = new SearchUC7();

		list.addNode(56);
		list.addNode(30);
		list.addNode(70);

		list.display();

		
         
		if (list.search(list.head, 30))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

	
}

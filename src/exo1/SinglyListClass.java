package exo1;
//import java.util.*;

public class SinglyListClass {
	private Node header;
	
	public SinglyListClass() {
		header = null;
	}
	
	public Node getHeader() {
		return header;
	}
	
	
	public boolean isEmpty() {
		if(header == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer first() {
		if(isEmpty()) {
			return null;
		}else {
			return header.getElement();
		}
	}
	
	public Integer last() {
		if(isEmpty()) {
			return header.getElement();
		}

		Node current = header;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		return current.getElement();
	}
	
	public void addLast(Integer element) {
		Node newNode = new Node(element);
		if (header == null) {
			header = newNode;
			return;
		}
		
		if(header.getNext() != null) {
			header.setNext(newNode);
			
		}
		
		Node tmpHeader = header;
		while(tmpHeader.getNext() != null) {
			tmpHeader = tmpHeader.getNext();
		}
		tmpHeader.setNext(newNode);
	}
	
	@Override
	public String toString() {
		if (header == null) {return "";}
		
		StringBuilder sb = new StringBuilder(header.toString());
		Node current = header;
		
		while(current.getNext() != null) {
			current = current.getNext();
			sb.append("" + current.toString());
		}
		return sb.toString();
	}
	
	private static class Node {
		private Integer element;
		private Node next;
		
		public Node(Integer element) {
			this.element = element;
		}

		public Node(Integer element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		public Integer getElement() { 
			return element;
		}
		
		public Node getNext() { 
			return next;
		}
		
		public void setElement(Integer newElem) { 
			element = newElem;
		}
		
		public void setNext(Node newNxt) { 
			next = newNxt; 
		}
		
	}
	
	public static void main(String[] args) {
		SinglyListClass maListe = new SinglyListClass();
		System.out.println("Test 1 : " + maListe.getHeader());
		maListe.addLast(5);
		System.out.println("Test 2 : " + maListe.getHeader());
		maListe.addLast(2);
		maListe.addLast(7);
		System.out.println("Test 3 : " + maListe.getHeader());
	}
}

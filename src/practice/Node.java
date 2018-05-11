package practice;

public class Node {

	private String data;
	private Node next;
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data=data;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	Node(){
		
	}
	
	public Node(String data, Node next) {
		this.setData(data);
		this.setNext(next);
	}
	
}

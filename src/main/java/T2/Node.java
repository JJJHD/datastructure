package T2;

public class Node {
	
	public Node(Object value)
	{
		this.value=value;
	}
	
	Object value;//����
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	Node next; //��һ���ڵ�ĵ�ַ(��������)
}

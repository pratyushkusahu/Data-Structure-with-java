package linkedListOmpl;

public class LinkedList {
public static Node head;
//Insert at the end of the list
public Node insert(Node Llist,int value) {
	Node temp= new Node(value);
	if(Llist==null) {
		head=temp;
	}else {
		Node curretNode=head;
		while(curretNode.next!=null) {
			curretNode=curretNode.next;
		}
		curretNode.next=temp;
		
	}
	return Llist;
}
}

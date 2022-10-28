package l101;

public class l102 {
node head;
public l102(node head) {
	this.head=head;
}
	public void add(node newnode) {
		newnode.next=head;
		head=newnode;
	}
	public void delet(node newnode) {
		
		head=head.next;
	}
	public void display() {
		node n=head;
		while(n != null) {
			System.out.println(n.vlaue);
			n=n.next;
		}
	}
}

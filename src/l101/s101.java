  package l101;

public class s101<T> {
	
	int size;
	int top;
	
	Object[] s101;
	public s101(int size) {
		this.size=size;
		s101 =new Object[this.size];
		top=-1;
	}

	
	public void push(Object newItem) {
		if(isfull()) return;
		top=top+1;
		s101[top]=newItem;
	}
	public T pop(){
		if(isemputy()) return null;
		T item=(T)s101[top];
		top=top-1;
		return item;
		
	}
	
	public Boolean isfull() {
		return(top==size-1);
	}
	public Boolean isemputy() {
		return(top==-1);
	}
	
}

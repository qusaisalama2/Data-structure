package l101;

public class QueueArraya<T> {
	Object[] ArrayaQueue;
	int Rear;
	int Front;
	int size;

	public QueueArraya(int size) {
		this.size=size;
		ArrayaQueue=new Object[this.size];
		Front=-1;
		Rear=-1;
		
		
	}
	Boolean  isFull(){
		return (Rear==size-1);
		
		
	}
	Boolean  isEmouty(){
		return (Front==-1);
		
		
	}
	
	public void Queue(Object newItem) {
		if(isFull()) return;
		Rear=Rear+1;
		ArrayaQueue[Rear]=newItem;
		if(Front==-1) 
			Front=0;
		
		
		
	}
public T DeQueue() {
	if(isEmouty()) 
	{
		System.out.print("queue is emputy");
		return null;
	}
	T sc =(T) ArrayaQueue[Front];
	Front = Front+1;
	
	return sc;
		
	}

}

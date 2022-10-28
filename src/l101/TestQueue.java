package l101;

public class TestQueue {

	public static void main(String[] args) {
		
		QueueArraya<String> s = new QueueArraya<String>(5);
		s.Queue("A");
		s.Queue("Af");
		s.Queue("Ad");
		s.Queue("Ax");
		s.Queue("Ax");
	
			System.out.println(s.DeQueue());
			System.out.println(s.DeQueue());
			System.out.println(s.DeQueue());
			System.out.println(s.DeQueue());
			System.out.println(s.DeQueue());
			System.out.println(s.Front);
		

			

		
		// TODO Auto-generated method stub

	}

}

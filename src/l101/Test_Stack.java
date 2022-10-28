package l101;

public class Test_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
s101<Integer> s= new s101<Integer>(10);
s.push(10);
s.push(11);
s.push(103);
s.push(104);
s.push(105);
System.out.println("top"+s.top);
System.out.println(s.pop());
System.out.println("top"+s.top);
	}

}

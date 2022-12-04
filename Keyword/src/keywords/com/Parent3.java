package keywords.com;

public class Parent3 implements Parent2 {//IMPLEMENTS KEYWORD (INTERFACE)

	@Override
	public void umar() {
		// TODO Auto-generated method stub
		System.out.println("the umar");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("the green");
	}
	public static void main(String[] args) {
		Parent3 o=new Parent3();
		o.green();
		o.umar();
		

	}

}

package keywords.com;

public class Parentclass {
	static int a=100;//STATIC KEYWORD
	final int c=100;//FINAL KEYWORD
	
	public int umar() {// RETURN KEYWORD
		int a=100;
		return a;
		
	}
	public void green() {//VOID KEYWORD
		int c=20;
		System.out.println("the value of void ="+c);
	}

	public static void main(String[] args) {//STATIC METHOD KEYWORD
Parentclass ob=new Parentclass ();//NEW KEYWORD
int u = ob.umar();//RETURN KEYWORD METHOD
System.out.println("the value of return ="+u);
ob.green();
System.out.println(a);//BLOCK
System.out.println(ob.c);
	}

}


public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
//	    int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
	    
	    a=a+b;   //a=30
	    b=a-b;   //b=10
	    a=a-b;   //a=20
	    
	    System.out.println(a);
		System.out.println(b);
	    
	}

}

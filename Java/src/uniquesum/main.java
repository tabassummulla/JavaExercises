package uniquesum;

public class main{
	
	public static void main(String[] args) {
		

	System.out.println(Sum(12,11,23));
	}
	
	
	public static int Sum(int a, int b, int c) {
		
		if(a==b && b==c ) {
			return 0;
		} else if(a ==b) {
			
			return c;
		}
		else if(b==c) {
			return a;
		}
		else if(a==c) {
			return b;
		}
		else 
			{
			return a+b+c;
			}
	}
	
	
}
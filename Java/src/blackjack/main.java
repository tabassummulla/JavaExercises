package blackjack;


public class main {
	
	public static void main(String[] args) {
	
		System.out.println(blackjack(18,19));
		
		blackjack(18,19);
		
	}
	
	
	public static int blackjack(int a, int b) {
	
		if (a <= 21 && b <=21) {
		
			if(a > b ) {
					return a;
		}
			else if(a ==21 && b==21 )
			{
				return a;
			
			}
			
			else if(b >a ) {
				return b;
			}
	}
				
			if( a <= 21 && b > 21) {
				
				return a;
			}
	
		else if ( a >21 && b <=21) {
				
				return b;
				
		} else if( b > 21 && a > 21) {
				
				return 0;
		}
		else if( a == b && a <21 && b<21) {
		
			return a; 
			
	}
	return b;
}}



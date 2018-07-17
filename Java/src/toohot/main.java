package toohot;
public class main{
	public static void main(String[] args) {
		
		System.out.println(Weather(94, false));
		
	}
	
	public static boolean Weather(int temp, boolean isSummer ){
		
		if( temp>=60 && temp<=90) {
			return isSummer= false;
		}
		else 
			if (temp<=100 && temp>=60) {
			return isSummer = true;
		}
		return isSummer;
		
	}
	
}
package it.alessandrodonato.codeeval.primepalindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 999; i > 100 ; i--) {
			if (isPalindrome(i)) 
				if (!isNotPrime(i)) {
					System.out.println(i);
					break;
				}
		}
	}
	
	private static boolean isPalindrome (int val) {
		final String ori = Integer.toString(val);
		final StringBuilder s = new StringBuilder(ori);
		final String des = s.reverse().toString();
		
		if (ori.equalsIgnoreCase(des))
			return true;
		else
			return false;
	}
	
	private static boolean isNotPrime (int i) {
		for (int div = 2; div < (i/2 - 1); div++) 
			if (i % div == 0)
				return true;
		
		return false;
	}
	

}

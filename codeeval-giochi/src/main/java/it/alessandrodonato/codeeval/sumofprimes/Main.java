package it.alessandrodonato.codeeval.sumofprimes;

public class Main {

	public static void main(String[] args) {

		int sum = 0;
		int current = 2;
		for (int cicli = 1 ; cicli <= 1000 ; ) {
			//System.out.print(cicli + " - " + current);
			if (!isNotPrime (current)) {
				sum += current;
				cicli++;
				//System.out.print (" -> PRIME");
			} 
			//System.out.println( " - " + sum);
			current++;
		}
		System.out.println(sum);
	}

	private static boolean isNotPrime (int i) {
		for (int div = 2; div <= (i/2); div++) 
			if (i % div == 0)
				return true;
		
		return false;
	}
}

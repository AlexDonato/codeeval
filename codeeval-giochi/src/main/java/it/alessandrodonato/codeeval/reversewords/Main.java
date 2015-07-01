package it.alessandrodonato.codeeval.reversewords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader (args[0]));
			String row;
			Stack<String> st = new Stack<String>();
			StringTokenizer tokenizer;
			String sep;
			while ((row = reader.readLine()) != null) {
				
				if (!row.trim().isEmpty()) {
					tokenizer = new StringTokenizer(row, " ");
					st = new Stack<String>();
					sep = "";
					 
					while (tokenizer.hasMoreTokens())
						st.push(tokenizer.nextToken());
					 
					while (!st.isEmpty()) {
						System.out.print(sep + st.pop());
						sep = " ";
					}
	 
					System.out.println();
				}
			}
			reader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.exit(0);
	}

}

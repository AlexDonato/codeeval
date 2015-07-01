package it.alessandrodonato.codeeval.datarecovery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) {
		try {
			BufferedReader reader = new BufferedReader (new FileReader(args[0]));
			
			String row;
			StringTokenizer tokenizer;
			ArrayList<String> words;
			ArrayList<Integer> order;
			while ((row = reader.readLine()) != null) {
				tokenizer = new StringTokenizer(row, ";");
				String [] sentenceAndHints = row.split(";");
				System.out.println(sentenceAndHints[0] + " - " + sentenceAndHints [1]);
				System.out.println("--------------------------------------------------------");
				tokenizer = new StringTokenizer(sentenceAndHints[0], " ");
				words = new ArrayList<String>();
				while (tokenizer.hasMoreTokens())
					words.add(tokenizer.nextToken());
					
				tokenizer = new StringTokenizer (sentenceAndHints [1], " ");
				order = new ArrayList<Integer>();
				while (tokenizer.hasMoreTokens())
					order.add(Integer.valueOf(tokenizer.nextToken()));
				
				final Integer max = Collections.max(order);
				String space = "";
				for (int i = 0 ; i < max.intValue() ; i++) {
					System.out.print(space + words.get(i));
					space = " ";
				}
			}
				
			reader.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

package it.alessandrodonato.codeeval.fuzzybuzzy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			final BufferedReader reader = new BufferedReader( new FileReader(args[0]) );
			String row;
			while ((row = reader.readLine()) != null) {
				final StringTokenizer tokenizer = new StringTokenizer (row, " ");
				final FuzzyBuzzyConfig config = new FuzzyBuzzyConfig();
				config.setFirstDivider(Integer.parseInt(tokenizer.nextToken()));
				config.setSecondDivider(Integer.parseInt(tokenizer.nextToken()));
				config.setMaxNumber(Integer.parseInt(tokenizer.nextToken()) + 1);
				final FuzzyBuzzyRunner runner = new FuzzyBuzzyRunner(config);
				runner.runGame();
			}
			
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
}

class FuzzyBuzzyConfig {
	private int firstDivider;
	public int getFirstDivider() {
		return firstDivider;
	}
	public void setFirstDivider(int firstDivider) {
		this.firstDivider = firstDivider;
	}
	public int getSecondDivider() {
		return secondDivider;
	}
	public void setSecondDivider(int secondDivider) {
		this.secondDivider = secondDivider;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	private int secondDivider;
	private int maxNumber;
}

class FuzzyBuzzyRunner {

	private FuzzyBuzzyConfig config;
	
	public FuzzyBuzzyRunner(FuzzyBuzzyConfig config) {
		this.config = config;
	}
	
	public void runGame () {
		for (int i = 1 ; i < config.getMaxNumber(); i++) {
			if ((i % config.getFirstDivider() == 0) && (i % config.getSecondDivider() == 0 ))
				System.out.print ("FB ");
			else if (i % config.getFirstDivider() == 0)
				System.out.print ("F ");
			else if (i % config.getSecondDivider() == 0)
				System.out.print ("B ");
			else 
				System.out.print (i + " ");
		}
		
		System.out.println();
	}	
}


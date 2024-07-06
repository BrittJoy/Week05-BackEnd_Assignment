package week05OOP;

import java.util.Date;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		Date date = new Date();
		
		StringBuilder spaced = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			spaced.append(log.charAt(i)).append(" ");
		}
		
		System.out.println(date.toString() + " " + spaced.toString().trim()); 
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		StringBuilder spaced2 = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			spaced2.append(error.charAt(i)).append(" ");
		}
		
		System.out.println(date.toString() + " " + "ERROR: " + spaced2.toString().trim());
		
	}

}


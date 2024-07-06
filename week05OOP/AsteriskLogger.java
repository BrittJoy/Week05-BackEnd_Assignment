package week05OOP;

import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + " " + "***" + log + "***"); 
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		
		StringBuilder asterisk = new StringBuilder();
		
		int totalLine = 3 + error.length() + 3;
		for (int i = 0; i < totalLine; i++) {
			asterisk.append("*");
		}
			
		System.out.println(date.toString() + "\n" + asterisk + "\n***" + error + "***" + "\n" + asterisk); 
		
		}

}


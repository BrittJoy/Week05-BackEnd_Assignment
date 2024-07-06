package week05OOP;


public class App {

	public static void main(String[] args) {
		
		
	Logger loggerAst = new AsteriskLogger();	
	loggerAst.log("Hello!");
	loggerAst.error("Error!");
	
	
	Logger loggerSpaced = new SpacedLogger();
	loggerSpaced.log("Hello!");
	loggerSpaced.error("Error!");
	
	}

}

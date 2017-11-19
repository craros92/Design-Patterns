package SingletonPattern;

public class Logger {
	public static Logger instance = null;
	
	public Logger(){
		// do nothing
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
}

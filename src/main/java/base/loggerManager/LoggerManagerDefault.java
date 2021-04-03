package base.loggerManager;

import org.apache.log4j.BasicConfigurator;

public class LoggerManagerDefault {
	
	public static boolean get() {
		BasicConfigurator.configure();
		return true;
	}

}

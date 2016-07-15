package com.mum.cs544.ftms.logger;

import org.springframework.stereotype.Component;

@Component
public class Logger implements ILogger{

	public void log(String logstring) {
		java.util.logging.Logger.getLogger("FtmsLogger").info(logstring);		
	}

}

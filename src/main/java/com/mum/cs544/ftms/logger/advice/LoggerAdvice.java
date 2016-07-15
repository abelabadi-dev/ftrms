package com.mum.cs544.ftms.logger.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;

import com.mum.cs544.ftms.logger.ILogger;


@Aspect
public class LoggerAdvice {
	    @Autowired
	    private ILogger logger;    
		
		
		@Before("within(com.mum.cs544.ftms.dao.*)")
		public void logbeforemethod(JoinPoint joinpoint){			
			logger.log("calling -- " + joinpoint.getSignature().getName() + "-- method ");
		}
		
		@Around("within(com.mum.cs544.ftms.service.*)")
		public Object invoke(ProceedingJoinPoint call ) throws Throwable {
			 StopWatch sw = new StopWatch();
			 sw.start(call.getSignature().getName());
			 Object retVal = call.proceed();
			 sw.stop();

			long totaltime = sw.getLastTaskTimeMillis();
			
			System.out.println("Time to execute --" + call.getSignature().getName() + "-- method  took " + totaltime + "ms");

			return retVal;
		}
		
		
		
}

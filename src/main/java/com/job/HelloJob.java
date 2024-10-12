package com.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
 
/**
 * This class defines a quartz job.
 * @author javawithease
 */
public class HelloJob implements Job{
	public static int i=1;
	
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("Hello Job"+i);
		
	}
}
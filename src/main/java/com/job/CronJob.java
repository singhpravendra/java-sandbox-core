package com.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

public class CronJob {
	public static void main(String[] args) throws SchedulerException {
		//Set Job 
		JobDetail jd=JobBuilder.newJob(HelloJob.class).withIdentity("helloJob","hello").build();
		//Timer
		Trigger trigger=TriggerBuilder.newTrigger().withIdentity("helloJTrigger","hello").withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?")).build();
		//Execute the Job
		Scheduler sch=new StdSchedulerFactory().getScheduler();
		sch.start();
		sch.scheduleJob(jd, trigger);
	}
}
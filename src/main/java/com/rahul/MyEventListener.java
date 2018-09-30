package com.rahul;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener<ContextClosedEvent> implements ApplicationListener
{

	public void onApplicationEvent(ApplicationEvent event) 
	{
		System.out.println(event.toString());
		
	}

}

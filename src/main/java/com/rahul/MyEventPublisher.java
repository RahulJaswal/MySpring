package com.rahul;

import org.springframework.context.ApplicationEvent;

public class MyEventPublisher extends ApplicationEvent 
{
		public MyEventPublisher(Object source)			//source is the object of the class where the event will be published
		{
			super(source);
		}
		
		public String toString()
		{
			return "Play method is executed";
		}
}

package com.rahul;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class Two implements Display,ApplicationEventPublisherAware
{
	Test obj;
	ApplicationEventPublisher publish;

	public void play() 
	{
		System.out.println("This is Class Two");
		System.out.println(obj.getA() +":"+obj.getB());
		MyEventPublisher event=new MyEventPublisher(this);
		publish.publishEvent(event);
	}

	public Test getObj() {
		return obj;
	}
	
	//@Resource(name="obj1")
	@Autowired
	public void setObj(Test obj) {
		this.obj = obj;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publish) {
		this.publish=publish;
		
	}

	
	
	
	
}

package com.rahul;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class First
{
	 public static void main( String[] args )
	    {
		 
		 @SuppressWarnings({ "deprecation", "resource" })
			//BeanFactory factory=new XmlBeanFactory(new FileSystemResource(" Spring.xml"));
		 AbstractApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
		 context.registerShutdownHook();
		 Display obj=(Display) context.getBean("two");
		 obj.play();
	    System.out.println(context.getMessage("stat", null, "This is default Message", null));
	    
	    }

}

package com.rahul;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Beanpostprocess implements BeanPostProcessor 
{
	//@Override
	public Object postProcessAfterInitialization(Object bean,String name) throws BeansException
	{
		System.out.println(name+" is  after initialized ");
		return bean;
	
	}
	
	public Object postProcessBeforeInitialization(Object bean,String name) throws BeansException
	{
		System.out.println(name+" is  before initialized ");

		return bean;
	}
}

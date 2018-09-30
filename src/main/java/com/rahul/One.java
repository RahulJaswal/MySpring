package com.rahul;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class Test implements BeanNameAware
{
	int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setBeanName(String arg0) {
		System.out.println("The name given to Test bean is "+arg0);
		
	}	
}

public class One implements ApplicationContextAware,BeanNameAware,InitializingBean,Display
{
	private Integer val;
	private Test obj1;
	private Test obj2;
	private ApplicationContext context=null;
	
	
	
	public Test getObj1() {
		return obj1;
	}

	public void setObj1(Test obj1) {
		this.obj1 = obj1;
	}

	public Test getObj2() {
		return obj2;
	}

	public void setObj2(Test obj2) {
		this.obj2 = obj2;
	}

	public Integer getVal() {
		return val;
	}
	
	
	/*public One(Integer i)
	{
		val=i;
	}*/

	public void setVal(Integer val) {
		this.val = val;
	}

	public void play()
	{
		System.out.println(getVal()+"This is class one");
		System.out.println(obj1.getA()+":"+obj1.getB());
		System.out.println(obj2.getB()+":"+obj2.getB());
		
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException 
	{
		this.context=arg0;
		
		System.out.println(((Test) context.getBean("obj1")).getB());
	}

	public void setBeanName(String arg0)
	{
		
		System.out.println("The name given to One bean is "+arg0);

	}

	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Test properties are initialized");
		
	}
	public void destroy() 
	{
		System.out.println("Test is disposed");
		
	}

}

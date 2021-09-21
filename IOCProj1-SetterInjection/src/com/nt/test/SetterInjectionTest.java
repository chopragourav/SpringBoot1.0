package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//locate and hold spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC Container
		XmlBeanFactory factory=new  XmlBeanFactory(res);
		//get target bean class obj
		Object obj=factory.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the B.logic
		String result=generator.generateWishMessage("Gourav");
		System.out.println(result);
	}
}

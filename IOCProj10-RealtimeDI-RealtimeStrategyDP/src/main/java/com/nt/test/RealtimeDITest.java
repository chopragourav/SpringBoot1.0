package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		// read I/P from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name=sc.next();
		System.out.println("Enter Customer Address: ");
		String addrs=sc.next();
		System.out.println("Enter principle Amount: ");
		String pAmt=sc.next();
		System.out.println("Enter Time: ");
		String time=sc.next();
		System.out.println("Enter Rate of Intrest: ");
		String rate=sc.next();
		
		//create CustomerVO clas obj
		CustomerVO vo=new CustomerVO();
		vo.setCustName(name);vo.setCustAddrs(addrs);
		vo.setPamt(pAmt);vo.setTime(time);vo.setRate(rate);
		
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		 //get Controller class obj 
		 MainController controller=factory.getBean("controller",MainController.class);
		 //invoke the methods
		 try {
			String result=controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem --Try Again:::"+e.getMessage());
		}
	}

}

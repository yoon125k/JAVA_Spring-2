package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
		public static void main(String[] args) {
			ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
			
			MesaageBean banana = (MesaageBean)factory.getBean("banana");
			banana.sayHello();
			
			MesaageBean apple = (MesaageBean)factory.getBean("apple");
			apple.sayHello();
			
			MesaageBean mango = (MesaageBean)factory.getBean("mango");
			mango.sayHello();
		}

}

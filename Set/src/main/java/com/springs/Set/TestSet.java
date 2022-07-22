package com.springs.Set;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String[] args) {
     ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/springs/Set/NewFile.xml");
     NewSet n1=(NewSet)c1.getBean("abc");
     System.out.println(n1);
     Set<String> s1=n1.getDetails();
     System.out.println(s1.getClass());
	}

}

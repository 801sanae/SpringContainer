package com.hanains.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	testApplicationContext();
    }
    
    public static void testBeanFactory() {
    	BeanFactory beanFactory = new XmlBeanFactory( new ClassPathResource( "config/applicationContext2.xml" ) );
    	
    	// 1. type 으로 가져오기
    	User user = beanFactory.getBean( User.class );	
    	System.out.println( user.getName() );
    	
    	// 2. name 가져오기
    	User user1 = (User)beanFactory.getBean( "user" );
    	System.out.println( user1.getName() );
    }
    
	public static void testApplicationContext() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "config/applicationContext.xml" );
		
		User user1 = (User)applicationContext.getBean( "user1" );
		System.out.println( user1 );
		
		User user2 = (User)applicationContext.getBean( "user2" );
		System.out.println( user2 );
		
		User user3 = (User)applicationContext.getBean( "user3" );
		System.out.println( user3 );		
		
		Friend friend = (Friend)applicationContext.getBean( "friend" );
		System.out.println( friend );		
		
		
		
		
		(( AbstractApplicationContext ) applicationContext ).close();
	}
}

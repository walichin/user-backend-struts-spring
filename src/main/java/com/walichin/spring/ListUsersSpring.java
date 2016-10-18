package com.walichin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import com.walichin.dataaccess.UserDao;
import com.walichin.dataaccess.UserData;

public class ListUsersSpring {
	
	public List<UserData> listUsers() {
    	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserDao dao = (UserDao) ctx.getBean("edao");
		
	    List<UserData> list = dao.getAllUsers();  
	          
	    for(UserData e:list)  
	        System.out.println("name: "+e.getName()+" login: "+e.getLogin()+" password: "+e.getPassword());
	    
	    return list;
	    
	}
}

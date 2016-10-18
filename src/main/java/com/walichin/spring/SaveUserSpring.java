package com.walichin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walichin.dataaccess.UserDao;
import com.walichin.dataaccess.UserData;

public class SaveUserSpring
{
    public boolean saveUser(UserData user) {
    	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserDao dao = (UserDao) ctx.getBean("edao");
		//int status = dao.saveUser(new UserData("Ricardo Centi", "rcenti", "c0lm1ll0"));
		int status = dao.saveUser(user);
		
		System.out.println("Resultado: " + status);
    	
        return true;
    }
}

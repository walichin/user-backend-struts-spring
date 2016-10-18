package com.walichin.dataaccess;

import org.hibernate.Session;
import com.walichin.persistence.HibernateUtil;
 
public class SaveUser
{
    public boolean saveUser(UserData user) {
    	
		System.out.println("Maven + Struts + Hibernate");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();        
        
        return true;
    }
    
}

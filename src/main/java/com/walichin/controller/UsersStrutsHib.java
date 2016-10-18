package com.walichin.controller;

import java.io.PrintWriter;
import java.sql.*;  
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import com.walichin.dataaccess.UserData;
import com.walichin.persistence.HibernateUtil;  
  
public class UsersStrutsHib {  
	ArrayList<UserData> list=new ArrayList<UserData>();  
	  
	public ArrayList<UserData> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<UserData> list) {  
	    this.list = list;  
	}  
	
	public String execute(){  
	 try{  
	              
		System.out.println("Maven + Struts + Hibernate");
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    
	    Query query = session.createSQLQuery(
			"select * from adm_user_mt")
			.addEntity(UserData.class);
	    
		java.util.List rs = query.list();
	    		
		int num_filas = rs.size();
		int fila = 0;
		
		while (fila < num_filas) {
			
			UserData user = (UserData) rs.get(fila);
			list.add(user);
			fila++;
		}
		
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "users";  
	}  
}  

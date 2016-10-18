package com.walichin.controller;

import java.util.ArrayList;
import java.util.List;

import com.walichin.common.ConvertListUser;

public class ListUserController {
    
	List<UserForm> list=new ArrayList<UserForm>();  
	  
	public List<UserForm> getList() {  
	    return list;  
	}
	
	public void setList(List<UserForm> list) {  
	    this.list = list;  
	}  
	
	public String execute() {
		
		ConvertListUser convertListUser = new ConvertListUser();
		list = convertListUser.convertListUser();
        return "users";
    }
}

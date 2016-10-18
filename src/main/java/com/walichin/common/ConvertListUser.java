package com.walichin.common;

import java.util.ArrayList;
import java.util.List;

import com.walichin.controller.UserForm;
import com.walichin.spring.ListUsersSpring;
import com.walichin.dataaccess.UserData;
 
public class ConvertListUser
{
	List<UserForm> listUserForm = new ArrayList<UserForm>();
	List<UserData> listUserData = new ArrayList<UserData>();
	ListUsersSpring listUsersSpring = new ListUsersSpring();
	
	public List<UserForm> convertListUser() {
    	
		listUserData = listUsersSpring.listUsers();
		
		for(UserData userData:listUserData) {
			
			UserForm userForm = new UserForm();
			
			//userForm.setUser_id(userData.getUser_id());
			userForm.setName(userData.getName());
			userForm.setLogin(userData.getLogin());
			userForm.setPassword(userData.getPassword());
			
			listUserForm.add(userForm);
			
		}
		
		return listUserForm;
    }
}

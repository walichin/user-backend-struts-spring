package com.walichin.common;

import com.walichin.controller.UserForm;
import com.walichin.spring.SaveUserSpring;
import com.walichin.dataaccess.UserData;
 
public class ConvertUser
{
	UserData userDest = new UserData();
	SaveUserSpring saveUserSpring = new SaveUserSpring();
	
	public boolean convertUser(UserForm userOrig) {
    	
		//userDest.setUser_id(userOrig.getUser_id());
		userDest.setName(userOrig.getName());
		userDest.setLogin(userOrig.getLogin());
		userDest.setPassword(userOrig.getPassword());
		
		if (saveUserSpring.saveUser(userDest)) {
			return true;
		}
		return false;
    }
}

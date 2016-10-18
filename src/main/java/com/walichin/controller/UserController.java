package com.walichin.controller;

import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;
import com.walichin.common.ConvertUser;
 
@SuppressWarnings("serial")
public class UserController extends ActionSupport 
{
    private Date nowDate;
    private UserForm userOrig;
 
    @Override
    public void validate(){
        if (userOrig.getName()==null || userOrig.getName().length()==0)
            addActionError(getText("name-msg-validation"));
        if (userOrig.getLogin()==null || userOrig.getLogin().length()==0)
            addActionError(getText("login-msg-validation"));
        if (userOrig.getPassword()==null || userOrig.getPassword().length()==0)
            addActionError(getText("password-msg-validation"));
    }
 
    @Override
    public String execute() throws Exception {
    	
        nowDate = new Date();
        
        ConvertUser convertUser = new ConvertUser();
        
        if (convertUser.convertUser(userOrig)) {
        	return ActionSupport.SUCCESS;
        }
        
        return ActionSupport.ERROR;
    }
    
    public Date getNowDate() {
        return nowDate;
    }

	public UserForm getUserOrig() {
		return userOrig;
	}

	public void setUserOrig(UserForm userOrig) {
		this.userOrig = userOrig;
	}
    
}

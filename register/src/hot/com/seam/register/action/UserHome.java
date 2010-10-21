package com.seam.register.action;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.seam.register.model.User;

@Name("userHome")
public class UserHome extends EntityHome<User>
{
    @RequestParameter Long userId;

    @Override
    public Object getId()
    {
        if (userId == null)
        {
            return super.getId();
        }
        else
        {
            return userId;
        }
    }
    

    @Override @Begin
    public void create() {
        super.create();
    }
    
    @Factory("user")
    public User initUser(){
    	return getInstance();
    }

}

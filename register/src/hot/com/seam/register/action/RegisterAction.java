package com.seam.register.action;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.international.StatusMessages;

import com.seam.register.model.User;

@Stateless
@Name("register")
public class RegisterAction implements Register
{
    @Logger private Log log;

    @In StatusMessages statusMessages;
    
    @PersistenceContext 
    private EntityManager em;
    
    @In private User user;
    

    public String register()
    {
        // implement your business logic here
        log.info("register.register() action called");
        statusMessages.add("register");
        
        List users = em.createQuery("select u.name from User u where u.name=#{user.name}")
        				.getResultList();
        if(users.size() == 0){
        	em.persist(user);
        	return "/userList.xhtml";
        }else{
        	FacesMessages.instance().add("User #{user.name} is already exists!");
        	return null;
        }
    }

    // add additional action methods

}

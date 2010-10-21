package com.seam.message.action;

import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;
import org.jboss.seam.annotations.datamodel.DataModelSelection;
import org.jboss.seam.log.Log;
import org.jboss.seam.international.StatusMessages;
import org.hibernate.validator.Length;

import com.seam.message.model.Message;

@Stateful
@Scope(ScopeType.SESSION)
@Name("messageManager")
public class MessageManagerBean implements MessageManager
{
    @Logger private Log log;

    @In StatusMessages statusMessages;
    
    @DataModel 
    private List<Message> showMessages;

    @DataModelSelection 
    @Out(required=false)
    private Message message;
    
    @PersistenceContext(type=PersistenceContextType.EXTENDED)
    private EntityManager em;
    

    @Factory("showMessages")
    public void findMessages()
    {
        // implement your business logic here
    	showMessages = em.createQuery("select msg from Message msg order by msg.datetime desc").getResultList();
    }

    // add additional action methods

    public void select(){
    	if(message != null){
    		message.setRead(true);
    	}
    }
    
    public void delete(){
    	if(message !=null){
    		showMessages.remove(message);
    		em.remove(message);
    		message=null;
    		
    	}
    }

    @Remove
    public void destroy() {}

}

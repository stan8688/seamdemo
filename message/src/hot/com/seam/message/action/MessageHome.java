package com.seam.message.action;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.seam.message.model.Message;

@Name("messageHome")
public class MessageHome extends EntityHome<Message>
{
    @RequestParameter Long messageId;

    @Override
    public Object getId()
    {
        if (messageId == null)
        {
            return super.getId();
        }
        else
        {
            return messageId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

}

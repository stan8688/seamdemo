package com.seam.message.action;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import com.seam.message.model.Message;

@Name("messageList")
public class MessageList extends EntityQuery<Message>
{
    public MessageList()
    {
        setEjbql("select message from Message message");
    }
}

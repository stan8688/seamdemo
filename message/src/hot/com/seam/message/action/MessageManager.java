package com.seam.message.action;

import javax.ejb.Local;

@Local
public interface MessageManager
{
    public void findMessages();
    public void select();
    public void delete();
    public void destroy();

    // add additional interface methods here

}

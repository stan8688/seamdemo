package com.seam.register.action;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import com.seam.register.model.User;

@Name("userList")
public class UserList extends EntityQuery<User>
{
    public UserList()
    {
        setEjbql("select user from User user");
    }
}

package com.seam.message.action;

import javax.ejb.Local;

@Local
public interface Authenticator {

    boolean authenticate();

}

package com.seam.register.action;

import javax.ejb.Local;

@Local
public interface Authenticator {

    boolean authenticate();

}

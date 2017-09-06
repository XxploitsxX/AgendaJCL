package com.jonycamacho.agenda1;

import java.io.Serializable;

/**
 * Created by jonym on 05/09/2017.
 */

public class ContactA implements Serializable {
    private String user;
    private String email;
    private String twit;
    private String fon;
    private String naci;

    public ContactA(String user, String email, String twit, String fon, String naci) {
        this.user = user;
        this.email = email;
        this.twit = twit;
        this.fon = fon;
        this.naci = naci;
    }

    @Override
    public String toString() {
        return user+"\n"+email;
    }
}

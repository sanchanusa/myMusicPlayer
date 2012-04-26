/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

/**
 *
 * @author Brandon
 */
public class User {
    
    protected String username;

    public User(){        
    }
    
    public User(String username){
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

/**
 *
 * @author Xavier
 */
public class Implementation {
    private final String USERNAME = "java";
    private final String PASSWORD = "java";
    private final int PORT = 5050;
    private final String HOSTNAME = "localhost";

    public String getUsername(){
        return this.USERNAME;
    }

    public String getPassword(){
        return this.PASSWORD;
    }

    public int getPort(){
        return this.PORT;
    }

    public String gethostName(){
        return this.HOSTNAME;
    }
}

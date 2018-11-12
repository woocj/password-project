/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmihello;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author Xavier
 */
public class HelloServant extends UnicastRemoteObject implements HelloService
{
    public HelloServant() throws RemoteException {
        super();
    }
    public String echo(String input) throws RemoteException {
        return "From server: " + input;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmihello;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Xavier
 */
public interface HelloService extends Remote{
    public String echo(String input) throws RemoteException;
            
}

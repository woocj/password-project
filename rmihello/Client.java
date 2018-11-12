/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmihello;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Xavier
 */
public class Client {
    public static void main( String[] args ) throws NotBoundException, MalformedURLException, RemoteException {
        HelloService service = (HelloService) Naming.lookup("rmi://localhost:6665/hello");
        System.out.println("--- " + service.echo("hey server"));
    }
}

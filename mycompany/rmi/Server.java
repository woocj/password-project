package com.mycompany.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	
	private static final int PORT = 5252;

	public static void main(String[] args) {
		
		try {
			
			
			Authentication authentication = new AuthenticationImpl();
			
			
			Registry registry = LocateRegistry.createRegistry(PORT);
			
			
			registry.bind("auth", authentication);
			
			System.out.println("Authentication Service running at "+PORT+" port...");
			
		} catch (RemoteException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}

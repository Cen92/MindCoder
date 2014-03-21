package com.example.antlrtest;

import java.util.ArrayList;


public class BluetoothManager {
	public ArrayList<String> codeToSend;
	private static BluetoothManager instance;
	private BluetoothManager(){ //private for singleton
		codeToSend = new ArrayList<String>();
	}
	
	public static BluetoothManager getInstance() { //quick and dirty way to instanciate var. 
	    if (instance == null) {
	        instance = new BluetoothManager();
	    }
	    return instance;
	}
	
	public  void addToArray(String arg){
		codeToSend.add(arg);	
		System.out.println(codeToSend);
	}	

}

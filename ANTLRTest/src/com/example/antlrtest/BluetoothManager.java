package com.example.antlrtest;

import java.util.ArrayList;

public class BluetoothManager {
	public ArrayList<String> codeToSend;

	public BluetoothManager(){
		codeToSend = new ArrayList<String>();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public  void addToArray(String arg){
		codeToSend.add(arg);		
	}

}

package com.collectData;

import java.io.IOException;

public class Singleton_class {
	
	private Singleton_class() {
		
	}
	
	public static Singleton_class getinstance_Sc() {

		Singleton_class single=new Singleton_class();
		
		return single;
		
		
	}
	
	public Import_Data getinstance_ID() throws IOException {  
		
		Import_Data i=new Import_Data();
		
		return i;
	}

}

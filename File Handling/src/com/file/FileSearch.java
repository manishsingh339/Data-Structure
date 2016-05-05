package com.file;

import java.io.File;
import java.util.HashSet;

public class FileSearch {
	static HashSet<String> hs = new HashSet<String>();
	public static void main(String[] args) {
		File file = new File("/home/manish/Desktop/Server/ESL/repository");
		searchDirectory(file);
		System.out.println(hs);		
	}
	
	static public void searchDirectory(File path) {
	    if( path.exists() ) {	      
	      File[] files = path.listFiles();
	      for(int i=0; i<files.length; i++) {		    	
	      	if(files[i].isDirectory()) {
	        	searchDirectory(files[i]);
	         }else if((files[i].getPath().indexOf("_all.json") != -1) && (files[i].getName().indexOf("unit") == 0)){
	        	 //System.out.println(files[i].getParent());
	        	 hs.add(files[i].getParent());
	         }
	      }

	    }	    
	  }

}

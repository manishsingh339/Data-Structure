package com.file;

import java.io.File;
import java.io.FileInputStream;

public class fileDirDelete {

	public static void main(String[] args) {
		File file = new File("/home/manish/Desktop/10/");
		deleteDirectory(file);
	}
	
	static public void deleteDirectory(File path) {
	    if( path.exists() ) {	      
	      File[] files = path.listFiles();
	      for(int i=0; i<files.length; i++) {
	         if(files[i].isDirectory()) {
	           deleteDirectory(files[i]);
	         }else {
	        	 System.out.println("Try to delete: "+files[i].getPath());
	             files[i].delete();
	         }
	      }
	      path.delete();
	    }	    
	  }
}

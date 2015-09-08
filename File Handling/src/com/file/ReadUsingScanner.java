package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//This solution is incomplete. 
public class ReadUsingScanner {

public static void main(String[] args) {
    
	//File file = new File("");

    Scanner sc = new Scanner("/home/manish/Desktop/one.txt");
	while (sc.hasNextLine()) {
	    int i = sc.nextInt();
	    System.out.println(i);
	}
	sc.close();
 }
}
package com.file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class priceDetails implements Serializable{
	private int day;
	private double price;
	
	priceDetails(int day, double price){
		this.setDay(day);
		this.setPrice(price);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

/*
 * This call will create write and read file using FileOutputStream/FileInputStream and 
 * ObjectOutputStream/ObjectInputStream
 */

public class ReadAndWriteFile {

	public static void main(String[] args) {
		priceDetails pd1 = new priceDetails(1,123.90);
		priceDetails pd2 = new priceDetails(2,1231.90);
		priceDetails pd3 = new priceDetails(3,1232.90);
		priceDetails pd4 = new priceDetails(4,1203.90);
		priceDetails pd5 = new priceDetails(5,1023.90);
		try {
			FileOutputStream fl = new FileOutputStream("one.txt");
			ObjectOutputStream os = new ObjectOutputStream(fl);
			os.writeObject(pd1);
			os.writeObject(pd2);
			os.writeObject(pd3);
			os.writeObject(pd4);
			os.writeObject(pd5);		
			os.flush();
			os.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		readFile();
	}
	
	public static void readFile(){		
		try {
			FileInputStream fl = new FileInputStream("one.txt");
			ObjectInputStream os = new ObjectInputStream(fl);			
			priceDetails pd1 = (priceDetails)os.readObject();
			System.out.println(pd1.getPrice());
			priceDetails pd2 = (priceDetails)os.readObject();
			System.out.println(pd2.getPrice());
			priceDetails pd3 = (priceDetails)os.readObject();
			System.out.println(pd3.getPrice());
			priceDetails pd4 = (priceDetails)os.readObject();
			System.out.println(pd4.getPrice());			
			priceDetails pd5 = (priceDetails)os.readObject();		
			System.out.println(pd5.getPrice());
			os.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}																																																																																									
	}
}

package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SwaptwoArrayList {
	public static void main(String[] args) {
	ArrayList<String>Givenarray= new ArrayList<String>();
     Givenarray.add("Oranges");
     Givenarray.add("Apples");
     Givenarray.add("Pineapples");
     Givenarray.add("Kiwi");
     Givenarray.add("Grapes");
     System.out.println("Before swapping");  
    System.out.println(Givenarray);
  //Inbuilt function for swapping two elments of an Collections.swapp(Arraylistname,Index,index);

   Collections.swap(Givenarray,3,4);
     
    System.out.println("After swapping");
    System.out.println(Givenarray);
     
	}    
}   
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
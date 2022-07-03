package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class printAllElementsUsingIndex {
	public static void main(String[] args) {
		   ArrayList<String>Givenarray= new ArrayList<String>();
		    Givenarray.add("10");
		    Givenarray.add("20");
		    Givenarray.add("30");
		    Givenarray.add("40");
		    Givenarray.add("50");
		    int n=Givenarray.size();
		    System.out.println("Given List"+Givenarray); 
		    System.out.println("Using For loop");
for(int i=0;i<n;i++)
{
	 System.out.println("Given List-"+i); 
}
		    System.out.println("Using For Iterators");
		    Iterator<String> iterator=Givenarray.iterator();
while(iterator.hasNext())
{
String i=iterator.next();
System.out.println(i);
}








}
}	
	
	
	
	
	
	
	
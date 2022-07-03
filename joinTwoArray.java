package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class joinTwoArray {
	public static void main(String[]args)
	{
	ArrayList<String>List1=new ArrayList<String>();
	ArrayList<String>List2=new ArrayList<String>();
	List1.add("Audi");
	List1.add("Toyoto");
	List1.add("Honda");
	List1.add("BMW");
	System.out.println("List:"+List1);	
	List2.add("Ford");
	List2.add("Volkswagen");
	List2.add("Renault");
	List2.add("Ferrari");
	System.out.println("List2:"+List2);	
	//Inbuilt function for Joining two arrays arraylist1.addAll(arraylist2);
	List1.addAll(List2);		
	System.out.println("Joined List:"+List1);	
		
		
		
	}

}

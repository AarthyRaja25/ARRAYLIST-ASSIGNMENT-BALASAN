package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class ensureCapacity {
	public static void main(String[] args)
	{
	ArrayList<Integer>Numbers=new ArrayList<Integer>(5);
	Scanner sc=new Scanner(System.in);
	Numbers.add(5);
	Numbers.add(6);
	Numbers.add(7);
	Numbers.add(8);
	System.out.println("Given ArrayList"+Numbers); 
	
	Numbers.ensureCapacity(15);
	//System.out.println("Given ArrayList"+Numbers); 
	
	for(int i:Numbers)
		
	{
		System.out.println("Given ArrayList: "+i); 
	}
			
		
	}

}




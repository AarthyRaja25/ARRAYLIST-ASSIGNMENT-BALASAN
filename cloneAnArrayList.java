package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class cloneAnArrayList {
	public static void main(String[] args)
	{
	ArrayList<String>GivenList= new ArrayList<String>();
    GivenList.add("Oranges");
    GivenList.add("Apples");
    GivenList.add("Pineapples");
    GivenList.add("Kiwi");
    GivenList.add("Grapes");
    System.out.println("Given List"+GivenList); 
    ArrayList ClonedList=new ArrayList();
    // Inbuilt function for cloning----(ArrayList)ArrayListname.clone();
    ClonedList=(ArrayList)GivenList.clone();
    System.out.println("Given List"+ClonedList); 
}
}
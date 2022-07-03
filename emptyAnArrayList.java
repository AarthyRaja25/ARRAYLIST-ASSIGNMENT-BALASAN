package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class emptyAnArrayList {
	public static void main(String[] args) {
   ArrayList<String>Givenarray= new ArrayList<String>();
    Givenarray.add("10");
    Givenarray.add("20");
    Givenarray.add("30");
    Givenarray.add("40");
    Givenarray.add("50");
    int sizeofgivenarray=Givenarray.size();
    System.out.println("size before emptying arraylist: "+sizeofgivenarray);	
    Givenarray.clear();
    int sizeofnewarray=Givenarray.size();
    System.out.println("size before emptying arraylist: "+sizeofnewarray);	
    
    
    

}
}
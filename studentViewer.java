package ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class studentViewer {

	public void iteratestudentDetails() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("**To iterate student Details** ");
		System.out.println(" ");
		for(studentPojo pojo:studentDetails.studentdatabase)
		{
			System.out.println();
			System.out.println("Reg No:"+pojo.studentRegNo());
			System.out.println("studentname:"+pojo.studentName());
			System.out.println("studentAge"+pojo.studentAge());
			System.out.println("mobileNumber"+pojo.mobileNumber());
			System.out.println("Email"+pojo.Email());
			System.out.println();		
			
		}
	}

	public void studentViewByRegNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("  **Student viewer**");
		System.out.println();
		System.out.println("Enter a student RegNo :");
	long regNo=sc.nextLong();
	for(studentPojo pojo:studentDetails.studentdatabase)
	{
		if(regNo==pojo.studentRegNo())
		{
			System.out.println();
			System.out.println("student regNo"+pojo.studentRegNo());
			System.out.println("studentname:"+pojo.studentName());
			System.out.println("studentAge"+pojo.studentAge());
			System.out.println("mobileNumber"+pojo.mobileNumber());
			System.out.println("Email"+pojo.Email());
			System.out.println();
		}
	
		}
	}

	public void studentremovebyname() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("  **Student viewer**");
		System.out.println();
		System.out.println("Enter a student RegNo :");
	long regNo=sc.nextLong();
	int i=0;
	for(studentPojo pojo:studentDetails.studentdatabase)
	{
		if(regNo==pojo.studentRegNo())
		{
			studentDetails.studentdatabase.remove(i);
		
		}
		i++;
		
	}
		
		
	}

	public void studentSortByName() {
		// TODO Auto-generated method stub
	Collections.sort(studentDetails.studentdatabase,new sortbyname());
			
	}

	public void studentsuffleByRegNo() {
		// TODO Auto-generated method stub
		Collections.shuffle(studentDetails.studentdatabase);
	}

	public void studentExtratorByteIndex() {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println(" ");
//		System.out.println("Enter the size of the list which is divided ");
	
		
		
	}		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



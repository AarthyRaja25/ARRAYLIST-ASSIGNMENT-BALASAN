package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class studentDetails {
		protected static long studentRegNo;
		protected static String studentName;
		protected  static byte studentAge;
		protected static long mobileNumber;
		protected static String Email;
	protected static ArrayList<studentPojo>studentdatabase=new ArrayList<studentPojo>();
		public void studentDetails() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Add Studentdetails");
			System.out.println("Enter your RegNo:");
			this.studentRegNo=sc.nextLong();
			System.out.println("Enter your Name:");
			sc.nextLine();
			this.studentName=sc.nextLine();
		   System.out.println("Enter your Age");
			this.studentAge=sc.nextByte();
			System.out.println("Enter your mobileNumber:");
			this.mobileNumber=sc.nextLong();
			System.out.println("Enter your Email:");
			this.Email=sc.nextLine();
			sc.nextLine();
		}
		public static void main(String[] args)
		{	
			
			studentPojo pojo=new studentPojo();	
		pojo.setstudentdetails(studentRegNo,studentName,studentAge,mobileNumber,Email);
			
			studentDetails.studentdatabase.add(pojo);
		}	
		}





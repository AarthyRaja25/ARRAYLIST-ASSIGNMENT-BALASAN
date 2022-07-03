package ArrayList;
public class studentPojo {
		
		private long studentRegNo;
		private String studentName;
		private byte studentAge;
		private long mobileNumber;
		private String Email;
		
		public long studentRegNo() {
			return studentRegNo;
		}
		public String studentName() {
			return studentName;
		}
		public byte studentAge() {
			return studentAge;
		}
		public long mobileNumber() {
			return  mobileNumber;
		}
		
		public String Email() {
			return Email;
		}
		
	public void setstudentdetails(long studentRegNo,String studentName,byte studentAge,long mobileNumber,String Email)
	{
		this.studentRegNo=studentRegNo;
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.mobileNumber=mobileNumber;
		this.Email=Email;
	}
		
		
		
		
		
	}


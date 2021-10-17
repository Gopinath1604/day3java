package org.Day3.App;

public class Student_Driver 
{

	public static void main(String[] args)
	{
		StudentInfo s1 = new StudentInfo();
		StudentInfo s2 = new StudentInfo();
		StudentInfo s3 = new StudentInfo();
		
		s1.setName("Gopi");
		s1.setId(6);
		s1.setBranch("Cse");
		s1.setPhn(81434884);
		
		System.out.println("student1 details......");
		System.out.println("student name :"+s1.getName());
		System.out.println("student id :"+s1.getId());
		System.out.println("student branch :"+s1.getBranch());
		System.out.println("student phone number :"+s1.getPhn());
		
		System.out.println(".....................................................");
		s2.setName("Karhik");
		s2.setId(82);
		s2.setBranch("cse");
		s2.setPhn(123456702);
		
		System.out.println("student2 details......");
		System.out.println("student name :"+s2.getName());
		System.out.println("student id :"+s2.getId());
		System.out.println("student branch :"+s2.getBranch());
		System.out.println("student phone number :"+s2.getPhn());
		
		System.out.println(".....................................................");
		s3.setName("Anu");
		s3.setId(5);
		s3.setBranch("CSe");
		s3.setPhn(567895323);
		
		System.out.println("student3 details......");
		System.out.println("student name :"+s3.getName());
		System.out.println("student id :"+s3.getId());
		System.out.println("student branch :"+s3.getBranch());
		System.out.println("student phone number :"+s3.getPhn());
		
			
		
	}
		

	}



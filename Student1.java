package hello;

public class Student1 {
			private String name;
			private int rollNo;
			private int marks;
			
			public int getRollNo() {
				return rollNo;
			}
			public void setRollNo(int rollNo) {
				this.rollNo = rollNo;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getMarks() {
				return marks;
			}
			public void setMarks(int marks) {
				this.marks = marks;
			}
			public String checkResult() {
				if(marks>=40) {
					return "Pass";
				}
				else {
					return "Fail";
				}
			}
			public void displayDetails() {
				System.out.println("Roll no" +getRollNo());
				System.out.println("Name"+getName());
				System.out.println("Marks"+getMarks());
				System.out.println("Result"+checkResult());
			}
			public static void main(String[] args) {
				Student1 s1=new Student1();
				s1.setMarks(10);
				s1.setName("Vyshu");
				s1.setRollNo(95);
				s1.displayDetails();

			}

	}

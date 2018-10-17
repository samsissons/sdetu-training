package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stu1 = new Student("Janelle","321456987");
		Student stu2 = new Student("Thomas","311116987");
		Student stu3 = new Student("Elizabeth","3222256987");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.checkBalance();
		
	}

}

class Student {
	
	// Properites
	private static int iD=0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		balance = balance + costOfCourse;
	}
	
	public void payTuition() {
		
	}
	
	public void checkBalance() {
		System.out.print("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
		
	}
	
	public String toString() {
		return null;
		
	}
}

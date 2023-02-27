package assignment.student1;
import java.util.logging.*;
import java.util.*;
class Student1{
	public static void main( String[] args )
    {
		String name;
	    char gradelevel;
	    float gpa;
	    Scanner sc = new Scanner(System.in);
	    Logger log = Logger.getLogger("hi");
	    log.info("Enter Name: ");
        name = sc.nextLine();
        log.info("Enter Grade_Level:");
        gradelevel = sc.next().charAt(0);
        log.info("Enter GPA upto 10:");
        gpa = sc.nextFloat();
    	Student std = new Student(name,gradelevel,gpa);
        std.update();
        std.profile();
    }
}

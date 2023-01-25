package assignment.student1;

import java.util.*;
public class Student1 
{
	String name;
    char Grade_Level;
    float GPA;
    Scanner sc = new Scanner(System.in);

    Student1() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Grade_Level:");
        Grade_Level = sc.next().charAt(0);
        System.out.println("Enter GPA upto 10:");
        GPA = sc.nextFloat();
    }

    void update() {
        System.out.print("You want to Update Your GPA\n1.Yes\n2.No\nEnter 1 or 2: ");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.print("Enter Updated GPA upto 10: ");
            float update_GPA = sc.nextFloat();
            GPA = update_GPA;
        }
    }

    void profile() {
        if (GPA <= 10) {
            System.out.println(name + " has a " + GPA + " GPA");
        } else {
            System.out.println("Enter valid GPA");
        }
    }
    public static void main( String[] args )
    {
    	Student1 std = new Student1();
        std.update();
        std.profile();
    }
}

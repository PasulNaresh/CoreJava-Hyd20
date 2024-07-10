
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int uid;
		String name;
		String college;
		
		 Student(int uid,String name,String college) {
		
			this.uid = uid;
			this.name = name;
			this.college = college;
		} 
		
		Scanner sc = new Scanner(System.in);{
		System.out.println("Enter Uid:");
		System.out.println("Enter your name:");
		System.out.println("Enter college name:");
		int Uid =sc.nextInt();
		String Name =sc.next();
		String College =sc.next();
		
		System.out.println("Uid: " + Uid);
		System.out.println("Name: " + Name);
		System.out.println("College: " + College);
		
		
		
		
		}

	}

}


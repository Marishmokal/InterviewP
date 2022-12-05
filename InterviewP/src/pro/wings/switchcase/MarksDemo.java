package pro.wings.switchcase;

import java.util.Scanner;

public class MarksDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks");
	int marks=sc.nextInt();
	switch(marks)
	{
	case 50:
		System.out.println("Second class");
		break;
		
	case 60:
		System.out.println("Higher second class");
		break;
		
	case 70:
		System.out.println("first class");
		break;
		
	case 80:
		System.out.println("First class with distinction");
		break;
	case 90:
		System.out.println("Topper");
		break;
		
	default :
		
	}
}
}

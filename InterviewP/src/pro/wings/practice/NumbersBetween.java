package pro.wings.practice;

import java.util.Scanner;

public class NumbersBetween {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	num=sc.nextInt();
	for(int i=0;i<num;i++)
	{
		if(num>0 && num<=5 || num>6 && num<=9)
		{
			System.out.println("between range");
		}
		else
		{
			System.out.println("out of range");
		}
	}
}
}

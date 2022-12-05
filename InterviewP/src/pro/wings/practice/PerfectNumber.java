package pro.wings.practice;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	int num;
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	num=sc.nextInt();
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
		
	}
	if(num==sum)
	{
		System.out.println("perfect number");
	}
	else
	{
		System.out.println("not perfect number");
	}
			
}
}

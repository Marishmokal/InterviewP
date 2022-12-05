package pro.wings.practice;

import java.util.Scanner;

public class FibonancySeries {
public static void main(String[] args) {
	int num;
	int a=0;
	int b=1;
	int c=0;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter any number");
//	num=sc.nextInt();
	for(int i=0;i<=7;i++)
	{
		c=a+b;
		a=b;
		b=c;
	System.out.println(c);
	}
}
}

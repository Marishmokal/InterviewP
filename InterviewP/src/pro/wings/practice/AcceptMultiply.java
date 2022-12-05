package pro.wings.practice;

import java.util.Scanner;

public class AcceptMultiply {
public static void main(String[] args) {
	int num;
	int mul=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		mul=mul*i;
	}
	System.out.println(mul);
}
}

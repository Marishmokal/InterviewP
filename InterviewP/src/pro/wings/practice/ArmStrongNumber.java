package pro.wings.practice;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	int num;
	int r,c,arm=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	num=sc.nextInt();
	c=num;
	while(num>0)
	{
		r=num%10;
		arm=arm+r*r*r;
		num=num/10;
	}
	if(c==arm)
	{
		System.out.println("armStrong number");
	}
	else
	{
		System.out.println("not armStrong number");
	}
}
}

package pro.wings.practice;

import java.util.Scanner;

public class AdditionOfDigit {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int num,r,sum=0;
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;num!=0;i++)
	{
		r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.println(sum);
}
}

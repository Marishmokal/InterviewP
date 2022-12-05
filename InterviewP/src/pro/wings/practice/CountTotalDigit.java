package pro.wings.practice;

import java.util.Scanner;

public class CountTotalDigit {
public static void main(String[] args) {
	int num,count=0;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	while(num!=0)
	{
		num=num/10;
		++count;
	}
	System.out.println("number is"+count);
}
}

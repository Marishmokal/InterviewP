package pro.wings.practice;

import java.util.Scanner;

public class AcceptAndReverse {
public static void main(String[] args) {
	int num,reverse=0;
	int rem=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	while(num>0)
	{
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
	}
	System.out.println(reverse);
}
}

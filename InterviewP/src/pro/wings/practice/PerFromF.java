package pro.wings.practice;

import java.util.Scanner;

public class PerFromF {
public static void main(String[] args) {
	int num,rem=0;
	int sum=0;
	int reverse=0;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
//	while(num>0)//display digits sepratly
//	{
//		rem=num%10;
//		num=num/10;
//		System.out.println(rem);
//	}
//	while(num!=0)//addition of digits
//	{
//		rem=num%10;
//		sum=sum+rem;
//		num=num/10;
//	}
//	System.out.println(sum);
	
	while(num!=0)//reverse number
	{
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
		
	}
	System.out.println(reverse);
}
}

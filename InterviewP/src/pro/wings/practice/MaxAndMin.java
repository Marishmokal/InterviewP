package pro.wings.practice;

import java.util.Scanner;

public class MaxAndMin {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int rem=0;
	int MAX=num%10;
	int MIN=num%10;
	while(num>0)
	{
		rem=num%10;
		if(rem<MIN)
		{
			MIN=rem;
		}
		else if(rem>MAX)
		{
			MAX=rem;
		}
		num=num/10;
	}
	System.out.println("maximum number is"+MAX);
	System.out.println("minimum number is"+MIN);
}
}

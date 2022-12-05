package pro.wings.practice;

import java.util.Scanner;

public class PositiveAndNegative {
public static void main(String[] args) {
	int num;
	int [] aa = new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter any 10 numbers:");

  for(int i = 0; i<10 ; i++) {
	  aa[i]=sc.nextInt();
  }
	int count1 = 0;
	int count2 = 0;
	for(int i=0;i<aa.length;i++)
	{
		if(aa[i]>0)
		{
			count1++;
			System.out.println("positive number: "+ aa[i]);
		}
		else
		{
			count2++;
			System.out.println("negative number: "+aa[i]);
		}
		
	}
		System.out.println("positive number: "+count1);

		System.out.println("negative number: "+count2);

	
	
}
}

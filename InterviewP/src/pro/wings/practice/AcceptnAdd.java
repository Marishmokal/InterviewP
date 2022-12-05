package pro.wings.practice;

import java.util.Scanner;

public class AcceptnAdd {
public static void main(String[] args) {
	int num=0;
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=0;i<=num;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}

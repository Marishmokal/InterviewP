package pro.wings.practice;

import java.util.Scanner;

public class RaiseTo {
public static void main(String[] args) {
	int power=0;
	int base=0;
	int result=1;
	Scanner s =new Scanner(System.in);
	System.out.println("enter Two number");
	base=s.nextInt();
	power=s.nextInt();
	for(int i=1;i<=power;i++)
	{
		result=result*base;
	}
	System.out.println(result);
}
}

package pro.wings.practice;

import java.util.Scanner;

public class AceeptnFact {
public static void main(String[] args) {
	int fact=1;
	int num;
	Scanner s =new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}

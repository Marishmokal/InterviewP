package pro.wings.switchcase;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int day;
		System.out.println("enter any day");
		day = s.nextInt();
		// Integer day=4;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;

		case 3:
			System.out.println("wedensday");
			break;

		case 4:
			System.out.println("thursday");
			break;

		case 5:
			System.out.println("friday");
			break;

		case 6:
			System.out.println("saturday");
			break;

		case 7:
			System.out.println("sunday");
			break;
		}
	}
}

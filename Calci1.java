package Calci;

import java.util.Scanner;

public class Calci1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First No : ");
		float a = sc.nextFloat();
		System.out.println("Enter Secound No : ");
		float b = sc.nextFloat();

		System.out.println("Select Operation ");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		int ch = sc.nextInt();
		if (a <= 0 || b <= 0) {
			System.out.println("please enter  No Greater than 0");
		} 
		else {

			switch (ch) {
			case 1:
				float add = a + b;
				System.out.println("Addition is : " + add);
				break;
			case 2:
				float sub = a - b;
				System.out.println("Subtraction is : " + sub);
				break;

			case 3:
				float mul = a * b;
				System.out.println("Multiplication is : " + mul);
				break;
			case 4:
				float div = a / b;
				System.out.println("Division is : " + div);
			case 5:
				System.exit(0);
			default:
				System.out.println("Please select From option 1-5");
			}

		}
	}

}

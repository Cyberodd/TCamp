package campClass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		float val1 = scan.nextFloat();
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the 2nd number:");
		float val2 = scan1.nextFloat();
		
		if (val1 > val2)
		{
			System.out.println("The 1st number is larger");
		}
		else if (val2 > val1){
			System.out.println("The 2nd number is larger");
			}
		else {
			System.out.println("The numbers are equal");
		}
		
		scan.close();
		scan1.close();
		}
}

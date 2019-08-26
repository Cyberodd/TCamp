/*
 * Write a program which takes marks and assigns a grade using the grading system
 * */
package campClass;

import java.util.Scanner;


public class conditionalTask {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter mark:");
			float mark1 = scan.nextFloat();

			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the 2nd number:");
			float val2 = scan1.nextFloat();
			
			if (mark1 > val2)
			{
				System.out.println("The 1st number is larger");
			}
			else if (val2 > mark1){
				System.out.println("The 2nd number is larger");
				}
			else {
				System.out.println("The numbers are equal");
			}
			
			scan.close();
			scan1.close();
		}
}

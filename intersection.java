package test5;

import java.util.Scanner;

public class intersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, number;
		boolean isIntersection = false;
		System.out.println("Please enter the number of elements of first Array ");
		int[] firstInputArray = new int[sc.nextInt()];
		System.out.println("Please enter the number of elements of second Array ");
		int[] secondInputArray = new int[sc.nextInt()];
		System.out.println("Enter the elements of first Array ");
		for (i = 0; i < firstInputArray.length; i++) {
			firstInputArray[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of second Array ");
		for (j = 0; j < secondInputArray.length; j++) {
			secondInputArray[j] = sc.nextInt();
		}
		System.out.println("Enter the number you want to check ");
		number = sc.nextInt();
		for (int m = 0; m < firstInputArray.length; m++) {
			for (int n = 0; n < secondInputArray.length; n++) {
				if (number == firstInputArray[m] && number == secondInputArray[n]) {
					isIntersection = true;
				}
			}
		}
		if (isIntersection) {
			System.out.println("The number you enter is an Intersection.");
		} else
			System.out.println("The number you enter is not an Intersection.");
		sc.close();
	}
}

package controlflow;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Eligible to donate Blood or not
		// age and weight

		System.out.println("Enter your age here:");
		byte age = scan.nextByte();

		if (age >= 20 && age <= 60) // 30T 30T 22F
		{
			System.out.println("Enter your weight her:");
			byte weight = scan.nextByte();

			if (weight >= 40 && weight <= 70)// 50T 35F
			{
				System.out.println("Eligible to donate BLOOD");
			} else // inner condition else
			{
				System.out.println("Not Eligible to donate BLOOD");
				System.out.println("Your weight not b/w 40 to 70kgs");
			}
		} else// outer condition else
		{
			System.out.println("Not Eligible to donate BLOOD");
			System.out.println("Your age not b/w 20 to 60kgs");
		}

	}

}

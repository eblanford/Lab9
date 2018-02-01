
/*
 *Emily Blanford 
 * 2/1/2018
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		//Get user input: number of cars
		System.out.print("How many cars are you entering: ");
		int cars = scan.nextInt();
		scan.nextLine();// junk line
		
		ArrayList<Car> carList = new ArrayList<Car>();

		//for each car, get user input
		for (int i = 1; i <= cars; i++) {
			System.out.print("Enter Car #" + i + " Make: ");
			String make = scan.nextLine();
			System.out.print("Enter Car #" + i + " Model: ");
			String model = scan.nextLine();
			// validator stores the numbers using ranges
			int year = Validator.getInt(scan, "Enter Car #" + i + " Year: ", 1808, 2022);
			double price = Validator.getDouble(scan, "Enter Car #" + i + " Price: ", 0);
			// Create a new car object & store in the ArrayList
			Car car = new Car(make, model, year, price);
			System.out.println();
			carList.add(car);


		}

		// Iterate through each ArrayList index and output formatted table
		System.out.println("Current Inventory: ");
		for (int i = 0; i < carList.size(); i++) {
			System.out.printf("%-20s %-15s %-10d $%,-10.2f \n", carList.get(i).getMake(), carList.get(i).getModel(),
					carList.get(i).getYear(), carList.get(i).getPrice());
		}

		scan.close();
	}


}

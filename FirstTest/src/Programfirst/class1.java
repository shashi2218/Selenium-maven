package Programfirst;

public class class1 {

		int passengers; // number of passengers 
		int fuelcap = 10; // fuel capacity in gallons
		int mpg = 5; // fuel consumption in miles per gallon

		// Display the range.
		void range() {
		System.out.println("Range is " + fuelcap*mpg);

		}


public static void main(String[] args) {
class1 object = new class1();
object.range();
}
}
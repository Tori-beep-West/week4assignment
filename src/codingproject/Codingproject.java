package codingproject;

public class Codingproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	



/*
 * 1. Create an array of int called ages that contains the following values: 3,
 * 9, 23, 64, 2, 8, 28, 93.
 */
 	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
 	
/*
 * a. Programmatically subtract the value of the first element in the array from
 * the value in the last element of the array (i.e. do not use ages[7] in your
 * code). Print the result to the console.
 */

 	//System.out.println(ages [ages.length - 1] - ages [0]);


/*
 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
 * longer than the ages array, and have more elements).
 */
 	
 	
 	
 	
//i. Make sure that there are 9 elements of type int in this new array.  

	int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 87};

//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
	
	

//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
	double sum = 0;
	for (int age : ages) {
		sum += age;
	
	} 
//	System.out.println(sum / ages.length);

/*2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
*/

	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//
	int sum2 = 0;
	for (String name : names) {
		sum2 += name.length();
		
	} System.out.println(sum2 / names.length);
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//
	StringBuilder concatenatedNames = new StringBuilder();
	for (String name : names) {
		if(concatenatedNames.length() > 0) {
			concatenatedNames.append(" ");
			
		}
		concatenatedNames.append(name);
		System.out.println(concatenatedNames.toString());
	}
	
//3. How do you access the last element of any array?
// It would be the length of the array minus one	
	
//4. How do you access the first element of any array?
// The array name[0]
	
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
	int nameLengths[] = {4, 8, 12, 16};
	
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
		int sum3 =0;
	for (int t =0; t < nameLengths.length; t++ ) {
		sum3 += nameLengths[t];
	} System.out.println("The sum of the array is: " + sum3);
	
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
	System.out.println(wordConcatendated("Hello", 3));
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
	String firstName = "Tori";
	String lastName = "West";
	
	String fullName = fullName(firstName, lastName);
	System.out.println("Your Name is: " + fullName);
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//
	int[] value = {3, 100, 9};
	boolean result = arrayGreaterThan100(value);
	System.out.println("Is the sum greater than 100? " + result);
	
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
//
	
	double[] elements ={45.3, 44, 438, 42};
	System.out.println("Average of Array Is: " + avgOfArray(elements));
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//
	boolean isHotOutside = true;
	double moneyInPocket = 22.50;
	System.out.println("Will I Buy You A Drink? " + willBuyDrink(isHotOutside, moneyInPocket));
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	boolean billsPaid = false;
	double moneyInBank = 75.32;
	System.out.println("Can we buy a new birthday outfit? " + birthdayOutfit(billsPaid, moneyInBank));
	
} //End of main ********************************************


//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
	
	public static String wordConcatendated (String word, int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			str += word;
		}
		return str;
	}
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
			
	}
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
// 
	public static boolean arrayGreaterThan100(int[] value) {
		int sum =0;
		for (int y : value) {
			sum += y;
			
		} return sum > 100;
	}
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	public static double avgOfArray(double[]elements) {
		double avg = 0;
		for (double t : elements) {
			avg += t;
		} return avg / elements.length;
	}
//
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
//	**************public static boolean avgisGreater(double[]number1, double[]number2) {
//		double average1 = calculateAverage
//		double averge2 = 
//	} return *****************
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	} 
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	public static boolean birthdayOutfit(boolean billsPaid, double moneyInBank) {
		return billsPaid && moneyInBank > 101.75;
	}
} // End of class
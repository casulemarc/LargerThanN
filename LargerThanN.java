/**
 * In a program, write a method that accepts two arguments: an array of integers and a number n.
 *  The method should print all of the numbers in the array that are greater than the number n 
 *  (in the order that they appear in the array, each on their own line).
 *  In the same file, create a main method and call your function using the following data sets:
 *  The array {1, 5, 10, 2, 4, -3, 6} and the number 3.
 *  The array {10, 12, 15, 24} and the number 12.
 *  Sample Run
 *  java LargerThanN
 *  5↵
 *  10↵
 *  4↵
 *  6↵
 *  15↵
 *  24↵
 *  
 * @author Mark Kasule
 *
 */
public class LargerThanN {

	public static void main(String[] args) {
	
	//first array
	int [] myList1 = {1, 5, 10, 2, 4, -3, 6};
	int numKey1 = 3;
	
	//second array
	int [] myList2 = {10, 12, 15, 24};
	int numKey2 = 12;
	
	//call first array
	printNumbers(myList1, numKey1);
	
	//call second array
	printNumbers(myList2, numKey2);

	}
	
	public static void printNumbers(int[] list, int num) {
		
		for(int values: list) {
			if(values > num) {
				System.out.println(values);
			}
		}
	}

}

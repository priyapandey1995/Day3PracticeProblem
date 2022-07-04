package Day03PracticeProblem;

import java.util.Scanner;

public class ToPrintArrayElements {

	public class PrintArrayElements {

		public static void main(String[] args) {
			//to print the elements of an array
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the array elements you want to store");
					int n = sc.nextInt();
					int[] array = new int[5];
					System.out.println("enter the array elements");
					for(int i=0;i<n;i++) {
						array[i]=sc.nextInt();
					}
					System.out.println("Array elements are:");
					//accessing the array elements
					 for(int i=0;i<n;i++) {
						 System.out.println(array[i]);
					 }
					 sc.close();

		}
}
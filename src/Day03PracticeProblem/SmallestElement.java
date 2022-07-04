package Day03PracticeProblem;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number array elements");
			int n = sc.nextInt();
			
			//declare and assign value to array
			int[] array = new int [n];
			
			//to enter the array elements
			System.out.println("enter the array elements");
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}
			
			//first poistion is assign to min variable
			int min = array[0];
			
			//loop through the array
			for(int i=0;i<n;i++) {
				
			//compare array element with min
				if(array[i]<min) {
					min = array[i];
				}
				
			}
			System.out.println("smallest element in an array is" + " " +min);
		}
}
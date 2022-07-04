package Day03PracticeProblem;

public class ElementsAtOddPoistion {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		
		//loop through the array by incrementing the value 2
		//here i will start from 0,because odd position starts at 0 
		for (int i=0;i<arr.length;i+=2) {
			System.out.println( arr[i]);
		
		}
	}

}

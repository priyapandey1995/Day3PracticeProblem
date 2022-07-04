package Day03PracticeProblem;

public class ElementsAtEvenPoistion {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,19,29};
		System.out.println("elements at even poistion are");
		
		//loop through the array by incrementing the value 2
		//here i will start from 1,because even position starts at 1
		
		for (int i=1;i<arr.length;i+=2) {
			System.out.println( + arr[i]);
		}


	}

}

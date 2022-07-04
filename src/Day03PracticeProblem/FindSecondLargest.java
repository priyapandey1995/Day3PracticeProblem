package Day03PracticeProblem;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] array = new int[] {25,11,7,75,56};
		int temp=0;
		
		//Displaying the original array
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//sort the array in ascending order
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					}
				}
			
		}
		System.out.println();
		
		//display elements after sorting
		System.out.println("display the second largest element is" +" "+ array[array.length-2]);
			
	    	}

}
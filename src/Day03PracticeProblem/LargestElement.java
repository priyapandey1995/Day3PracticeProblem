package Day03PracticeProblem;

public class LargestElement {

	public static void main(String[] args) {
		//declare and initialize the array
				int[] array = new int[] {25,11,7,75,56};
				
				//assign first element to max
				int max = array[0];
				
				//loop through the array
				for(int i=0;i<array.length;i++) {
					
				//compare elements if array with max
					if(array[i]>max) {
						max = array[i];
					}
					
				}
				System.out.println("largest element in an array is" + " " +max);

	}
}
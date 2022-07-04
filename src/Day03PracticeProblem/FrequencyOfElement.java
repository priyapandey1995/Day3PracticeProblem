package Day03PracticeProblem;

public class FrequencyOfElement {

	public static void main(String[] args) {
	    int array[] = new int[]{10,20,30,10,20,20,36,90,10};
			
			//array fr will store the frequencies of array
			int[] fr = new int[array.length];
			int visited = -1;
			for(int i=0;i<array.length;i++) {
				int count=1;
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						count++;
						//to avoid counting same elements
						fr[j] = visited;
					}
					
				}
				if(fr[i]!=visited) {
					 fr[i]= count;
				}
				
			}
			System.out.println("Elements | Frequency");
			for(int i=0;i<fr.length;i++) {
				if(fr[i]!=visited)
				{
					System.out.println(" " +array[i] + " | " + fr[i]);
				}
			}
			

		}
}
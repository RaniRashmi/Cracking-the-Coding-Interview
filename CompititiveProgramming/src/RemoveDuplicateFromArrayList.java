import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		int size = abc.nextInt();
		ArrayList<Integer> input = new ArrayList();
		for(int i =0; i<size; i++) {
			input.add(i,abc.nextInt());
		}
		ArrayList<Integer> output = removeDuplicates(input);
		for(int i =0; i<output.size(); i++) {
			System.out.print(output.get(i)+" ");
		}
		
	}

	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> input) {
		// as length is changing we need to extract is as separate variable
		int length = input.size()-1;
		for(int i =0,j=0; i<length;i++) {
			if(input.get(j)==input.get(j+1)) {
				input.remove(j);
			}
			else {
				j++;
			}
		}
		return input;
	}
	
}

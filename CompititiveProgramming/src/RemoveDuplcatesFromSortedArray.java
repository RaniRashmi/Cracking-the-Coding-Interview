import java.util.Scanner;

public class RemoveDuplcatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,2,2,3,3,3,3,4,4,4};
		int n = a.length;
		
		n = removeDuplcates(a,n);
		
		 // Print updated array
        for (int i=0; i<n; i++)
           System.out.print(a[i]+" ");

	}

	private static int removeDuplcates(int[] a, int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n == 1) return n;
		int []temp = new int[n];
		int j =0;
		for(int i =0 ;i<n-1;i++) {
			if(a[i] != a[i+1]) {
				temp[j++]= a[i];
			}
		}
		//for last element
		temp[j++] = a[n-1];
		
		for(int i =0;i<j;i++) {
			a[i]= temp[i];
		}
		return j;
	}

}

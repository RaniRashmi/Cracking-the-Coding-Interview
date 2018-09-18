import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] a = new int[n][n];
		for(int i =0;i<n;i++) {
				for(int j =0;j<n;j++) {
					a[i][j]= sc.nextInt();
				}
		}
		clockwiseRotation(a,n);

	}

	private static void clockwiseRotation(int[][] a, int n) {
		// TODO Auto-generated method stub
		//transpose of the matrix
		int temp;
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				//condition is must
				while(i>=j&&j<n-1) 
					j++;
				temp = a[i][j];
				a[i][j]= a[j][i];
				a[j][i]= temp;
			}
		}
		
		//show transpose matrix
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		//clockwise rotation
		for(int i =0;i<n;i++) {
			for(int j=0,b = n-1; j<n && j<b;j++,b--) {
				temp = a[i][j];
				a[i][j]=a[i][b];
				a[i][b]=temp;
			}
		}
		
		//final matrix print
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}

}

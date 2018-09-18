import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] a = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		zeroMatrix(a,n,m);

	}

	private static void zeroMatrix(int[][] a, int n, int m) {
		// TODO Auto-generated method stub
		int rowLength = a.length;
		int colomLength = a[0].length;
		
		boolean [] row = new boolean[rowLength];
		boolean []colom = new boolean [colomLength];
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				if(a[i][j]==0) {
					row[i]= true;
					colom[j]= true;
				}
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				if(row[i] || colom[j]) {
					a[i][j]=0;
				}
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}

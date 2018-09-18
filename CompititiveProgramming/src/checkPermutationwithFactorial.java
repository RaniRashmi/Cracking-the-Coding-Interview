import java.util.Scanner;

public class checkPermutationwithFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] arr = str.split(" ");
		
		long factorial = fact(arr[1].length());
		
		boolean flag = isPermutation(arr[0],arr[1]);
        if(flag) {
        	System.out.println("Yes "+factorial);
        }
        else {
        	System.out.println("No");
        }
	}

	private static boolean isPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length()) return false;
		int [] char_set = new int[256];
		for(int i=0;i<str1.length();i++) {
			char_set[str1.charAt(i)]++;
			char_set[str2.charAt(i)]--;
		}
		for(int i =0;i<256;i++) {
			if(char_set[i] !=0) {
				return false;
			}
		}
		return true;
	}

	private static long fact(int x) {
		// TODO Auto-generated method stub
		if(x == 1) return 1;
		return x*fact(x-1);
	}

}

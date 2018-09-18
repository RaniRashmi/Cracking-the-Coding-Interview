import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Input the first string");
	      String str1 = scanner.nextLine();
	      System.out.println("Input the first string");
	      String str2 = scanner.nextLine();
	      boolean flag = isPermutation(str1, str2);
	      if(flag) {
	    	  System.out.println("Permutation");
	      }
	      else {
	    	  System.out.println("Not Permutation");
	      }
	      boolean flag1 = isPermutation1(str1, str2);
	      if(flag) {
	    	  System.out.println("Permutation");
	      }
	      else {
	    	  System.out.println("Not Permutation");
	      }
	}

	//Method 1 :using sort method (sorting will take O(nlogn) time
	private static boolean isPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		return sort(str1).equals(sort(str2));
	}
	
	private static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);	
	}
	
	//Method 2 : 
	private static boolean isPermutation1(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length())
			return false;
		int [] char_set = new int[256];
		for(int i =0 ;i< str1.length();i++) {
			char_set[str1.charAt(i)]++;
			char_set[str2.charAt(i)]--;
		}
		for(int i =0;i<str1.length();i++) {
			if(char_set[i] != 0) {
				return false;
			}
		}
		return true;
	}

	

}

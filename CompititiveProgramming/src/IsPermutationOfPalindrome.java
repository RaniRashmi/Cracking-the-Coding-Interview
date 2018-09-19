import java.util.Scanner;

public class IsPermutationOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Input the string");
	      String str = scanner.nextLine();
	      
	      boolean flag = isPermutationOfPalindrome(str);
	      if(flag) {
	    	  System.out.println("Yes");
	      }
	      else {
	    	  System.out.println("No");
	      }
	}

	private static boolean isPermutationOfPalindrome(String str) {
		// TODO Auto-generated method stub
		int count_odd =0;
		int [] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c : str.toCharArray())
		{
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
				if(table[x]%2 == 1) {
					count_odd++;
				}
				else {
					count_odd--;
				}
				
			}
		}
		return count_odd <=1;
	}

	private static int getCharNumber(char value) {
		// TODO Auto-generated method stub
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(value);
		
		if(a<= val && val <=z) {
			return val-a;
		}
		return -1;
	}

}

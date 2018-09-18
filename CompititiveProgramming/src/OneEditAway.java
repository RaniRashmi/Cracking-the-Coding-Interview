import java.util.Scanner;

public class OneEditAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Input the first string");
	      String str1 = scanner.nextLine();
	      System.out.println("Input the first string");
	      String str2 = scanner.nextLine();
	      boolean flag = oneEditAway(str1,str2);
	      if(flag) {
	    	  System.out.println("Yes");
	      }
	      else {
	    	  System.out.println("No");
	      }
	      
	}

	private static boolean oneEditAway(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() == str2.length())
			return oneEditReplce(str1,str2);
		else if(str1.length()+1 == str2.length())
			return oneEditInsetAndRemove(str1,str2);
		else if(str1.length()-1 == str2.length())
			return oneEditInsetAndRemove(str2,str1);
		return false;
	}

	private static boolean oneEditInsetAndRemove(String str1, String str2) {
		// TODO Auto-generated method stub
		int index1=0,index2=0;
		while(index2 < str2.length() && index1 <str1.length()) {
			if(str1.charAt(index1) != str2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean oneEditReplce(String str1, String str2) {
		// TODO Auto-generated method stub
		boolean foundDifference = false;
		for(int i =0;i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i))
			{
				if(foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}

}

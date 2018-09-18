import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Input the string");
	      String str = scanner.nextLine();
	      int oldLength, newLength,space_count;
	      oldLength = str.length();
	      System.out.println("oldLength"+oldLength);
	      space_count = spaceCount(str);
	      newLength = oldLength + 2*space_count;
	      System.out.println("newLength"+newLength);
	      //add  "%20" in place of space
	      String newString  = urlify(str,oldLength,newLength);
	      System.out.println("result string "+newString);

	}

	private static String urlify(String str, int oldLength, int newLength) {
		// TODO Auto-generated method stub

		char [] charArray = new char[newLength];
		for(int i = 0;i<oldLength;i++) {
			charArray[i]= str.charAt(i);
		}
		for(int i =oldLength-1,j=newLength-1 ;i>=0;i--) {
			if(charArray[i] == ' ') {
				charArray[j--] = '0';
				charArray[j--] = '2';
				charArray[j--] = '%';			
			}
			else {
				charArray[j--] = charArray[i];
			}
		}
		return String.valueOf(charArray);
		
	}

	private static int spaceCount(String str) {
		// TODO Auto-generated method stub
		int space_count = 0;
		for(int i =0 ;i<str.length();i++) {
		 if(str.charAt(i) == ' ') {
			 space_count++;
		 }
		}
		return space_count;
	}

}

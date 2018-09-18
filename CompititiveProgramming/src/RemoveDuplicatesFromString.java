import java.util.Scanner;

public class RemoveDuplicatesFromString {

	// input string should be sorted
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String newString = removeDuplcate(str);
		System.out.println("without duplicate string : "+ newString);
		

	}

	private static String removeDuplcate(String str) {
		// TODO Auto-generated method stub
		int pos =0;
		StringBuffer sb = new StringBuffer();
		sb.append(str.charAt(0));
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) != sb.charAt(pos)) {
				sb.append(str.charAt(i));
				pos++;
			}
		}
		return sb.toString();
	}

}

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Input the string");
	      String str = scanner.nextLine();
	      String compressedString = stringCompression(str);
	      System.out.println("Compressed String : "+compressedString);

	}

	private static String stringCompression(String str) {
		// TODO Auto-generated method stub
		int count =1;
		int i =0;
		StringBuffer sb = new StringBuffer();
		//sb.append(str.charAt(0));
		for(i =0;i<str.length()-1;i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
			sb.append(str.charAt(i));
			sb.append(count);
			count=1;
			}
			else {
			count++;	
			}
		}
		
		sb.append(str.charAt(i));
		sb.append(count);
		
		if(str.length() > sb.toString().length()) return sb.toString();
		return str;
	}

}

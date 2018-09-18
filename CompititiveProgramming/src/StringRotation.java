import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		boolean flag = isRotation(str1, str2);
		if(flag) {
			System.out.println("s1 is rotation of s2");
		}
		else {
			System.out.println("s1 is not rotation of s2");
		}
		
		

	}

	private static boolean isRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		String str3 = str1 + str2;
		return isSubstring(str3, str2);
	}

	private static boolean isSubstring(String str3, String str2) {
		// TODO Auto-generated method stub
		return str3.contains(str2);
	}

}

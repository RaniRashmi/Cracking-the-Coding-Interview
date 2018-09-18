import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input the string");
      String str = scanner.nextLine();
      boolean flag = isUnique(str);
      if(flag) {
    	  System.out.println("Unique");
      }
      else {
    	  System.out.println("Not Unique");
      }
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		if(str.length() > 256)
			return false;
		boolean [] char_set = new boolean[256];
		for(int i =0; i<str.length();i++) {
			int value = str.charAt(i);
			if(char_set[value])
			{
				return false;
			}
			char_set[value] = true;
		}
		return true;
	}

}

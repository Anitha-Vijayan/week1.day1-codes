package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		StringBuffer newStr = new StringBuffer();
		for(int i =str.length()-1; i >= 0; i--)
		{
			newStr = newStr.append(str.charAt(i));
		}
		if (str.equalsIgnoreCase(newStr.toString())) {
			System.out.println("String is palindrome");
			
			
		} else {
			System.out.println("String is not palindrome");
		}
	}

}

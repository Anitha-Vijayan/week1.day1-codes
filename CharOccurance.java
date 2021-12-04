package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "welcome to chennai";
		System.out.println(str);
		
		int count =0;
		for (int i =0;i< str.length(); i++) {
			if (str.charAt(i)=='w')
			{
				count++;
			}
		}
		System.out.println("Occurrence of w: "+count);
	}
	

}


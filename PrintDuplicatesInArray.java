package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 
		int count =arr.length;
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) {
				if((arr[i]==arr[j]) && (i!=j)) {
					System.out.println("Duplicate values in given array is :"+arr[j]);
				}
				
			}
			
		}
	}

}

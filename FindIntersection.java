package week1.day2;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int [] arr1 = {3,2,11,4,6,7};
		int [] arr2 = {1,2,8,4,9,7};
		System.out.println("Intersection of Two Arrays");
		
		for(int i=0 ; i < arr1.length; i++) {
			for(int j=0; j < arr2.length; j++) {
				
				if (arr2[j]==arr1[i]) {
					System.out.println(arr2[j]);
				
				}
			}
		}
	}

}

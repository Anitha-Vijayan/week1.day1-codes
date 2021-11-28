package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =8;
		int FN=0;
		int SN=1;
		int sum;
		System.out.println("Fibonacci Series of 8:");
		System.out.println(FN);
		for(int i =1;i<range;i++) {
			
		sum=FN+SN;
		System.out.println(sum);
		FN=SN;
		SN=sum;
		
		}

	}

}

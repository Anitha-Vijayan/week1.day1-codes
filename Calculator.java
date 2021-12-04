package week1.day2;

public class Calculator {
	
	
  public int add(int num1, int num2) {
	  
	  return num1+num2;
	  
  }
  
public double sub(double num3, double num4) {
	  
	  return num3-num4;
	  
  }
  
public double mul(double num5, double num6) {
	  
	  return num5*num6;
	  
}
public int div(int num7, int num8) {
	  
	  return num7/num8;
	  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculator calc1 =new Calculator();
		System.out.println(calc1.add(10,20));
		System.out.println(calc1.sub(30,20));
		System.out.println(calc1.mul(70,20));
		System.out.println(calc1.div(80,20));

	}

}

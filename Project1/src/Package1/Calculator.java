package Package1;

public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	public int substract(int a, int b)
	{
		return a-b;	
	}
	public int multiplication (int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b)
	{
		return a/b;
	}
	
	//below is main method where we create object of class and access variables and methods with that object
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		int a=10; int b=2;
		int result1 = cal.add(a, b);
		int result2 = cal.substract(result1, b);
		int result3 = cal.multiplication(result2, b);
		int result4 = cal.division(result3, b);
		System.out.println(((((10/2)-2)+2)-2)*2);
			}

}

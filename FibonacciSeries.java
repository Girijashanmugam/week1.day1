package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int SecNum = 1;
		int Sum = 8;
		System.out.println(firstNum);
		for (int i=1; i<=range;i++)
		{
			Sum = firstNum + SecNum;
			firstNum = SecNum;
			SecNum = Sum;
			System.out.println("Sum");
		}
	}

}

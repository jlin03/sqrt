public class sqrt{
	public static double sqrt(double n) {
		return sqrtHelper(n,n/2);
	}
	
	public static double sqrtHelper(double n, double guess) {
		if(Math.abs((guess * guess) - n) > 0.00001) {
			return sqrtHelper(n,((n / guess) + guess) / 2);
		}
		else {
			return guess;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(2));
	}
	
	
}
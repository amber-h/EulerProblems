//Prime factor: prime number that divides the integer evenly 
public final class P3{

	public static void main(String[] args){
		long number = 600851475143l;
		System.out.println(new P3().solve(number));
	}

	public static int solve(long number){
		int i;
		for (i = 2; i <= number; i++){
			if (number % i == 0){
				number /= i;
				i--;
			}
		}
		return i;
	}
}

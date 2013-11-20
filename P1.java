//class designed as final, indicating the class is not designed to be inherited from

//first, find all multiples of 3 or 5
//next, find the sum of these multiples
public final class P1{

	public static void main(String[] args){
		System.out.println(new P1().solve());
	}

	public int solve(){
		int sum = 0;
		for (int i=0; i<1000; i++){
			if ( i%3 == 0 || i%5 == 0 )
				sum += i;
		}
		return sum;
	}
}


public final class P2{

	public static void main(String[] args){
		System.out.println(new P2().solve());
	}

	public int solve(){
		int n = 0;
		int sum = 0;
		int fiboNum = 0;
		while (fiboNum < 4000000) {
			fiboNum = fiboFinder(n);
			if ( fiboNum % 2 == 0 )
				sum += fiboNum;
			n++;
		}
		return sum;
	}

	public int fiboFinder(int n){
		int fiboNum;
		if ( n == 0 || n == 1 )
			fiboNum = n;
		else 
			fiboNum = fiboFinder(n-1) + fiboFinder(n-2);
		return fiboNum;
	}
}
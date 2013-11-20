//First find the largest palindrome
//Next, find its two three-digit factors
import java.util.*;
import java.lang.Object;
import java.math.BigInteger;

public final class P4{

	public static void main(String[] args){
		ArrayList<Integer> twoFactors = new ArrayList<Integer>(largestPalindrome());
		System.out.println(twoFactors);
	}

	public static ArrayList<Integer> largestPalindrome(){
		Integer num = 998001;
		ArrayList<Integer> twoFactors = new ArrayList<Integer>();
		boolean factorsFound = false;
		String reverse;
		Integer largestPalindrome;

		for (int i = num; i>0; i--){
			String stringNum = Integer.toString(i);
			reverse = new StringBuilder(stringNum).reverse().toString();

			if (reverse.equals(stringNum)){
				largestPalindrome = i; 
				for(int j = 999; j>=100 ; j--){
					if( largestPalindrome % j == 0 && (largestPalindrome / j) <= 999){
						twoFactors.add(0 , j );
						twoFactors.add(1 , largestPalindrome / j);
						factorsFound = true;
						break;
					}
				}
			}
			if( factorsFound == true)
				break;
		}
		return twoFactors;
	}
}
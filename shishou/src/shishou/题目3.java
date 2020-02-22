package shishou;

import java.util.Scanner;
import java.math.BigInteger;

public class ÌâÄ¿3 {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		BigInteger sum = BigInteger.valueOf(0);
		while(s.hasNext()) {
			BigInteger x = s.nextBigInteger();
			if(x.equals(new BigInteger("0"))) {
				break;
			}
			sum = sum.add(x);
		}
		s.close();
		System.out.println(sum);
	}
}

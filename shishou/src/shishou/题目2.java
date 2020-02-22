package shishou;

import java.util.Scanner;

public class ÌâÄ¿2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double Jan = s.nextDouble();
		double Feb = s.nextDouble();
		double Mar = s.nextDouble();
		double Apr = s.nextDouble();
		double May = s.nextDouble();
		double Jun = s.nextDouble();
		double Jul = s.nextDouble();
		double Aug = s.nextDouble();
		double Sept =s.nextDouble();
		double Oct = s.nextDouble();
		double Nov = s.nextDouble();
		double Dec = s.nextDouble();
		s.close(); 
		double Average = (Jan + Feb + Mar + Apr + May + Jun + Jul + Aug + Sept + Oct + Nov + Dec)/12;
		System.out.printf("$%.2f",Average);

	}

}

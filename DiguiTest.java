package weekday_class;

import java.util.Scanner;

/**
 *¿¿¿¿¿¿¿¿¿¿¿ 
 * @author Viaxiz
 *
 */
public class Main {
	
	/**
	 * Õ·×ªÇóÓà
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gcd2(int m,int n) {
		if(m%n==0)
			return m;
		else
			return gcd2(n,m%n);
	}
	/**
	 * ººÅµËþ
	 */
	public static int getTimes(int n) {
		if(n==1)
			return 1;
		else 
			return 2*getTimes(n-1)+1;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd2(1980,765));
		System.out.println(getTimes(2));
	}
}

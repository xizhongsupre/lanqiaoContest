package weekday_class;

import java.util.Scanner;

/**
 *真真真真真� 
 * @author Viaxiz
 *
 */
public class Main {
	
	/**
	 * 娵廬箔噫
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
	 * 査典満
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

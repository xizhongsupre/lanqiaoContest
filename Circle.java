import java.util.Scanner;

public class Circle {
	/* *
	*���ű�Begin-3: ��Բ�������������λС��
	*@author Viaxiz
	*/
	public static final double PI=Math.atan(1.0)*4; 
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		System.out.printf("%.7f",getCircleArea(x));
		//System.out.printf("%.7f",x*x*PI);
		a.close();
	}
	
	public static double getCircleArea(int r) {
		return r*r*PI;
	}
}
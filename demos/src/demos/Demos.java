package demos;

public class Demos {

	public static void main(String[] args) {

		/*
		 * �arpma a * b ; b�lme a / b ; ��karma a - b ; toplama a + b ;
		 */

		int a = 17;
		int b = 2;

		int carpma = a * b;// 8 * 2=16
		System.out.println("Bu bir �arpma i�lemidir:" + carpma);

		int bolme = a / b;// 8 / 2=4
		System.out.println("Bu bir b�lme i�lemidir:" + bolme);

		int c�karma = a - b;// 8-2=6
		System.out.println("Bu bir ��karma i�lemidir:" + c�karma);

		int toplama = a + b;// 8+2=10
		System.out.println("Bu bir toplama i�lemidir:" + toplama);

		int kalan = a % b; // 8 % 2=1
		System.out.println("Bu bir kalan i�lemidir:" + kalan);

	}
}

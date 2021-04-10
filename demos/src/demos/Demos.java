package demos;

public class Demos {

	public static void main(String[] args) {

		/*
		 * çarpma a * b ; bölme a / b ; çýkarma a - b ; toplama a + b ;
		 */

		int a = 17;
		int b = 2;

		int carpma = a * b;// 8 * 2=16
		System.out.println("Bu bir çarpma iþlemidir:" + carpma);

		int bolme = a / b;// 8 / 2=4
		System.out.println("Bu bir bölme iþlemidir:" + bolme);

		int cýkarma = a - b;// 8-2=6
		System.out.println("Bu bir çýkarma iþlemidir:" + cýkarma);

		int toplama = a + b;// 8+2=10
		System.out.println("Bu bir toplama iþlemidir:" + toplama);

		int kalan = a % b; // 8 % 2=1
		System.out.println("Bu bir kalan iþlemidir:" + kalan);

	}
}

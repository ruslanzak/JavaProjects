import java.util.Scanner;

class Money{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		System.out.println("5000: " + a/5000);
		a%=5000;
		System.out.println("1000: " + a/1000);
		a%=1000;
		System.out.println("500: " + a/500);
		a%=500;
		System.out.println("100: " + a/100);
		a%=100;
		System.out.println("50: " + a/50);
		a%=50;
		System.out.println("10: " + a/10);
		a%=10;
		System.out.println("5: " + a/5);
		a%=5;
		System.out.println("2: " + a/2);
		a%=2;
		System.out.println("1: " + a);
	}
}

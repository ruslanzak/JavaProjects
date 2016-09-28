import java.util.Scanner;

class Numbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b=1, c=0;
		while (a != -999) {
			if(a%2 == 0){
        b*=a;
      }
      if(a<0){
        c+=a;
      }
			a = scanner.nextInt();
		}
    if(b==1){
      System.out.print("Чётных чисел нет \n");
    }
    else{
      System.out.print("Произведение чётных: " + b + "\n");
    }

    if(c==0){
      System.out.print("Отрицательных чисел нет");
    }
    else{
      System.out.print("Сумма отрицательных: " + c);
    }
	}
}

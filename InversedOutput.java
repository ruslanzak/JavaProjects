import java.util.Scanner;

class InversedOutput{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int a[] = new int[k];

    for(int i = 0; i < k; i++){
      int q = scanner.nextInt();
      a[i] = q;
    }

    for(int i = a.length - 1; i>=0; i--){
      System.out.print(a[i] + " ");
    }

    System.out.print("\n\n");

    for(int i = 0; i < a.length/2;i++){
      int q = a[i];
      a[i] = a[a.length-1-i];
      a[a.length-1-i] = q;
    }
    for(int i = 0;i<a.length;i++){
      System.out.print(a[i] + " ");
    }
  }
}

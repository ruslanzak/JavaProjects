import java.util.Scanner;

class Bubble{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int[] a = new int[k];
    for(int i = 0; i < k; i++){
      int q = scanner.nextInt();
      a[i] = q;
    }

    for(int i = k - 1; i >= 0; i--){
      for(int j = 1; j <= i; j++){
        if(a[j - 1] > a[j]){
          int w = a[j - 1];
          a[j - 1] = a[j];
          a[j] = w;
        }
      }
    }

    for(int j = 0; j < k; j++){
      System.out.print(a[j] + " ");
    }
  }
}

import java.util.Scanner;

class PrimeComposite{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int[] a = new int[k];
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < k; i++){
      int q = scanner.nextInt();
      a[i] = q;
      if(q>max){
        max = q;
      }
    }

    int[] prime = new int[max + 100];

    for(int i = 2; i*i < max + 100; i++){
      if(prime[i] == 0){
        for(int j = i*i; j < max + 100; j += i){
          prime[j] = 1;
        }
      }
    }

    for(int i = 0; i < k - 1; i++){
      if(prime[a[i]] == 0 && prime[a[i+1]] == 1){
        System.out.print(i + " ");
      }
    }

  }
}

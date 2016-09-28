import java.util.Scanner;

class Removing{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int[] a = new int[k];
    for(int i = 0; i < k; i++){
      int q = scanner.nextInt();
      a[i] = q;
    }

    int w;
    w = scanner.nextInt();
    while(w!=-999){
      if(k == 0){
        break;
      }
      for(int i = w - 1; i < a.length; i++){
        if(i == a.length - 1){
          a[i] = 0;
          k--;
          if(k == 0){
            System.out.print("Array is empty!!!");
            break;
          }
          for(int j = 0; j < k; j++){
            System.out.print(a[j] + " ");
          }
          w = scanner.nextInt();
          continue;
        }
        a[i] = a[i + 1];
      }
    }
  }
}

import java.util.Scanner;

class Multiplication{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt(), w = scanner.nextInt();
    int[][] a = new int[q][w];
    for (int i = 0; i < q; i++ ) {
      for (int j = 0; j < w; j++ ) {
        a[i][j] = scanner.nextInt();
      }
    }
    int e = scanner.nextInt(), r = scanner.nextInt();
    int[][] b = new int[e][r];
    for (int i = 0; i < e; i++ ) {
      for (int j = 0; j < r; j++ ) {
        b[i][j] = scanner.nextInt();
      }
    }
    if(e != w){
      System.out.print("Ne korrektno!!!");
      System.exit(0);
    }
    System.out.print("\n\n");
    for (int i = 0; i < q; i++) {
      for (int j = 0; j < r; j++) {
        int m = 0;
        for(int z = 0; z < w; z++){
          m += a[i][z] * b[z][j];
        }

        System.out.print(m + " ");
      }

      System.out.print("\n");
    }

  }
}

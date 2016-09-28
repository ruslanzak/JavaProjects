import java.util.Scanner;

class Function1{
  public static int minArray(int[] q){
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < q.length; i++) {
      if(min > q[i]){
        min = q[i];
      }
    }
    return min;
  }
  public static int maxArray(int[] q){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < q.length; i++) {
      if(max < q[i]){
        max = q[i];
      }
    }
    return max;
  }
  public static int sumArray(int[] q){
    int sum = 0;
    for (int i = 0; i < q.length; i++) {
      sum += q[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    System.out.print(minArray(a) + "\n");
    System.out.print(maxArray(a) + "\n");
    System.out.print(sumArray(a));
  }
}

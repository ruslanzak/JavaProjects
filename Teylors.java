import java.util.Scanner;

public class Teylors{
  public static double sinTeylor(double a, double eps){
    double i = 0;
    double p = ((-a * a) / ((2 * i + 3) * (2 * i + 2)));
    double s = a;
    while (Math.abs(a * p + a) > eps){
      a *= ((-a * a) / ((2 * i + 3) * (2 * i + 2)));
      s += a;
      i++;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double b = scanner.nextDouble();
    double eps = 0.00001;
    System.out.println(sinTeylor(b, eps));
  }
}

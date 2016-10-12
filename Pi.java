import java.io.*;

public class Pi{
  public static double pi1(double eps) {
    double k = 1, p, a = 2;
    while (Math.abs(Math.PI - a) > eps) {
      a *= ((4*k*k) / (4*k*k - 1));
      k++;
    }
    return (k - 1);
  }

  public static double pi2(double eps) {
    double k = 1;
    double s = 2 * Math.log(2);
    while (Math.abs(Math.PI - s) > eps) {
      double a = (4 / ((2*k - 1) * (4*k - 1)));
      s += a;
      k++;
    }
    return (k - 1);
  }

  public static double pi3(double eps) {
    double k = 0;
    double a = 2 * Math.sqrt(3);
    double s = a;
    while (Math.abs(Math.PI - s) > eps) {
      double p = ((-2*k - 1)/(6*k + 9));
      a *= p;
      s += a;
      k++;
    }
    return k;
  }

  public static void main(String[] args) throws java.io.IOException{
    double eps = 0.0001;
    File file = new File("C:/Users/rusla/Desktop/java/Pi.txt");
    FileWriter fr = null;
    try {
        fr = new FileWriter(file);
        fr.write("Eps = " + eps + "\nIter1 = " + pi1(eps) + "\nIter2 = " + pi2(eps) + "\nIter3 = " + pi3(eps));
    }

    catch (IOException e) {
        e.printStackTrace();
    }

    finally{
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }
}

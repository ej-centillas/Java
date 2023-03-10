import java.util.Scanner;
public class RecursionFactorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println(factorial(num));

    sc.close();
  }

  public static int factorial(int num) {
    if(num == 1) {
      return num;
    } else {
      return num * factorial(num - 1);
    }
  }
}

import java.util.Scanner;
public class countUpward {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter starting number: ");
  int start = sc.nextInt();

  System.out.print("Enter ending number: ");
  int end = sc.nextInt();

  countUp(start, end);

  sc.close();
  }


  public static int countUp(int start, int end) {
    if(start == end) {
      System.out.println(start);
    } else {
      System.out.println(start);
      start++;
      countUp(start, end);
    }

    return start;
  }
}

// Question1: In a program input 3 numbers: A,B and C you have to output the average of these three numbers?

  import java.util.*;
  public class JavaBasics {
    public static void main(String args[]) {
      Scanner Sc = new Scanner(System.in);
      float A = Sc.nextFloat();
      int B = Sc.nextInt();
      short C = Sc.nextShort();
      float Average = (A + B + C)/3;
      System.out.println(Average);

      }
  }
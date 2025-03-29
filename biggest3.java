import java.util.Scanner;

class Main{
  public static void main(String[] args){
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    System.out.println("Enter the value of b: ");
    System.out.println("Enter the value of c: ");
    double a=input.nextDouble();
    double b=input.nextDouble();
    double c=input.nextDouble();

    String big=(a > b) ? "a" : (b > c) ? "b" : "c";

    System.out.println("Biggest number is "+ big);
    input.close();
  }
} 

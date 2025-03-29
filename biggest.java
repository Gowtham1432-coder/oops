import java.util.Scanner;

class Main{
  public static void main(String[] args){
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    System.out.println("Enter the value of b: ");
    double a=input.nextDouble();
    double b=input.nextDouble();

    String big=(a > b) ? "a" : "b";

    System.out.println("Biggest number is "+ big);
    input.close();
  }
} 




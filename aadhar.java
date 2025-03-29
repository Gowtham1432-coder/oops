import java.util.Scanner;
class main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Proof: ");
    String proof = input.next();
	  
    if (proof == "aadhar"){
      System.out.println("you can enter the exam hall");
    }
    else{
      System.out.println("You cannot enter the exam hall");
    }
  }
}
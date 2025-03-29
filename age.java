import java.util.Scanner;
class major{

	public static void main(String[] args){

	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the age: ");
	  int age=input.nextInt();
	  
	  if (age>=18) {
	  System.out.println("The person is a major");
	  }
	  
	  else{
            System.out.println("The person is a minor");
	  } 
	}
}

import java.util.Scanner;
class grade{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Marks: ");
    int marks = input.nextInt();
	
	if (marks >=95){
	  System.out.println("Grade=O");
	}
	
	else if(marks>=85){
	  System.out.println("Grade=A+");
	}
	
	else if(marks>=75){
	  System.out.println("Grade=A");
	}

	else if(marks>35){
	  System.out.println("Grade=P");
	}
	
	else if(marks<35){
	  System.out.println("Grade=F");
	}

	else{
	  System.out.println("You entered invalid marks");
	}
  }
}
import java.util.Sanner;

class si{
	public static void main(String[] args){
	
	  Scanner input =new Scanner(System.in);
	  
	  System.out.print("Enter the value of principle amount: ");
	  int p=input.nextint();
	  System.out.println("Principle amount = " + p);

	  System.out.print("Enter the value of time: ");
	  float t=input.nextfloat();
	  System.out.println("Time" + t);

	  System.out.print("Enter the value of rate of interest: ");
	  int r=input.nextint();
	  System.out.println("Rate of interest" + r);

	  total=(p*t*r)/100;
	  System.out.println("Simple interest =" + total);
	}
}
public class calculator {
    public int = a ;
    public int = b ;
    public int  = c ;
    
    
}

class adition extends calculator{
     public int d = a + b ;
     public int j = c+d ;
     public int e = d+j
     public void display()
     {

        System.out.println("Addition of a and b is " + d);
        System.out.println("Addition of c and d is " + j);
        System.out.println("Addition of d and j is " + e);
     } 

  

     }


 class subtraction extends addition {
        public int f = a - b ;
        public int g = c - d ;
        public int h = e - j ;
        public void watch() 
        
            System.out.println("Subtraction of a and b is " + f);
            System.out.println("Subtraction of c and d is " + g);
            System.out.println("Subtraction of e and j is " + h);
    
    
 }
 class multiplication extends subtraction {
 }
 class division extends multiplication {
 }
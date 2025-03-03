import java.util.*;
class myclass
{
static int count = 0;
final double pi = 3.14;
public void  myclass() 
{
  System.out.println(" the new is :"+  count++ ) ;
}

 public static void main(String[]  args)
{
myclass type1 = new myclass();
type1.count = 1;
type1.myclass();

myclass type2 = new myclass();
type2.count = 2;
type2.myclass();
}
}                                                                                         
                                                 



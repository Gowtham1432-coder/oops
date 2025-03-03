import java.util.*;
class book
{
public String author;
public String title;
public int year ;
 public void raydu()
{  
    System.out.println("RAYDU");
    System.out.println(" the aothor of the book is :"+author);
System.out.println("the title of the book is :"+title);
System.out.println("book is published  in the year :"+year);
}
public void god_is_great()
{
 System.out.println("GOD IS GREAT");
 System.out.println(" the author of the book is :"+author);
System.out.println("the title of the book is :"+title);
System.out.println("book is published  in the year :"+year);
}

public static void main(String args[])
{
book book1 = new book();
book1.author = " R.K.NARAYAN ";
book1.title = " MALGUDI DAYS ";
book1.year = 1952;
book1.raydu();

book book2 = new book();
book2.author = " R.G.V ";
book2.title = " pride of INDIA - GOD IS GREAT ";
book2.year = 1971;
book2.god_is_great();
}
}
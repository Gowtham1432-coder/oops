class car{
  //creating 4 attributes
  private String car_color;
  private String brand;
  private String fuel_type;
  private int milage;
//creating methods start and stop
public void start()
{
  System.out.println("car started");
}
public void stop()
{
  System.out.println("car stopped");
}
public void getcar(){
  new car();
  this.start();
  System.out.println("Car color: "+car_color);
  System.out.println("Car Brand: "+brand);
  System.out.println("Fuel Type: "+fuel_type);
  System.out.println("Milage: "+milage);
  this.stop();
  this.service();
  System.out.println();
}
 public static void main(String args[])
{
  car.car1=new car("Black";maruthi";"petrol";100);
  car1.getcar();
  car.car2=new car("grey";porshe";"diseel";70);
  car1.getcar();
  car.car3=new car("white";rolce royce";"petrol";90);
  car1.getcar();
}
}
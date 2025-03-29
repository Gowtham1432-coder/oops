class vehicle{
    void displayinfo(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
    @Override
    void displayinfo(){
        System.out.println("This is a car.It has a wheel");
    }
}
public class  vehicleDemo{
    public static void main(String args[]){
        car c=new car();
        c.displayinfo();
    }
}

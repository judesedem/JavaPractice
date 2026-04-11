public class Vehicle {
    void speed(){
        System.out.println("This is a vehicle");
    }
    
}

class Car extends Vehicle{
void noise(){
    System.out.println("The car goes vroom!");
}
}
class Bike extends Vehicle{
    void tyres(){
        System.out.println("The bike has 2 tyres");
    }
}

class Main{
    public static void main (String [] args){
        Car car= new Car();
        Bike bike=new Bike();

        bike.speed();
        car.speed();
        car.noise();
    }
}
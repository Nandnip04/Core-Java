abstract class Vehicle{
    abstract void demo();
}

class Car extends Vehicle{
    void demo (){
        System.out.println("car start with power Button");
    }
}

class Scooter extends Vehicle{
    void demo(){
        System.out.println("Scooty start with self");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.demo();

        Scooter s1=new Scooter();
        s1.demo();
        
    }
}

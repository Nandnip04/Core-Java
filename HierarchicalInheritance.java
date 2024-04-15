class Vehical{
    public void engine(){
        System.out.println("Vehical has a engine");
    }
}

class Car extends Vehical{
    public void carname(){
        System.out.println("Car name is Thar");
    }
}

class Bike extends Vehical{
    public void bikename(){
        System.out.println("Bike name is Yamaha R15 V4");
    }
}
public class HierarchicalInheritance {
    public static void main(String [] args){
        Car carobj=new Car();
        carobj.carname();
        carobj.engine();

        Bike bikeobj=new Bike();
        bikeobj.bikename();
        bikeobj.engine();

    }
}

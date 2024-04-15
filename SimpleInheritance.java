class Employee{
    public void calculateSalary(){
        System.out.println("Salary Calculated");
    }
}

class Manager extends Employee{
    public void calculateIntentive(){
        System.out.println("Calculate intensive");
    }
}
public class SimpleInheritance {
    public static void main(String [] args){
       Manager obj=new Manager();
       obj.calculateSalary();
       obj.calculateIntentive();
    }
}

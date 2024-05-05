import java.util.*;

class Employee{

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id +" : "+name;
    }

    
}
public class ArrayListDemo{
    public static void main(String[] args) {
        List <Employee> list=new ArrayList<>();

        Employee e1=new Employee(1,"nandni");
        Employee e2=new Employee(2,"diya");
        Employee e3=new Employee(3,"hardik");
        Employee e4=new Employee(4,"shubh");
        Employee e5=new Employee(1,"Jiya");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("show all employees :");
        for(Employee emp:list){
            System.out.println(emp);
        }

    }
}
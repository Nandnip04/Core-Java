class Calculator{
    public void add(int a,int b){
        System.out.println("sum of integer :"+(a+b));
    }

    public void add(double a,double b){
        System.out.println("sum of doubles:"+(a+b));
    }

    public void add(String a,String b){
        System.out.println("sum of strings:"+(a+b));
    }
}
 
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(12,3);
        calc.add(2.3,2.8);
        calc.add("Bhumika"," patel");
    }
}

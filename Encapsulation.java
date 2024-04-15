class Calculate{
    private int a;
    private int b;

    public void assignValue(){
        a=10;
        b=20;
    }

    public void sum(){
        System.out.println("sum of numbers is "+(a+b));
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Calculate obj=new Calculate();
        obj.assignValue();
        obj.sum();
    }
}

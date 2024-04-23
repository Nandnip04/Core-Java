interface Test{
    void display();

    static void sayHello(){
        System.out.println("hello !!!!");
    }

    default void sum(int a ,int b){
        System.out.println("sum : "+(a+b));
    }
}

class TestImpl implements Test{
    public void display(){
        System.out.println("this is display method");
    }
}
public class InterfaceExam {
    public static void main(String [] args){
        TestImpl t1=new TestImpl();
        t1.display();

        Test.sayHello();

        t1.sum(12, 23);
    }
}

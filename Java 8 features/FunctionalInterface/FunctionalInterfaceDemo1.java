@FunctionalInterface
interface Work{
    public void start (String msg);
    default void done(){
        System.out.println("work done !!!!!");
        hello();
    }
    public static void hello(){
        System.out.println("Hello.....");
    }

}
public class FunctionalInterfaceDemo1 implements Work{
    
    @Override
    public void start(String msg) {
       System.out.println("Functional Interface!!!");
       System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceDemo1 f1=new FunctionalInterfaceDemo1();
        f1.done();
        f1.start("This is start method of Functional Interface ");
        Work.hello();

    }

}

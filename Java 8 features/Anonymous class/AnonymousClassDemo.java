class Test{
    public void show(){
        System.out.println("Test's show called");
    }
}

public class AnonymousClassDemo{
    public static void main(String[] args) {

        Test t1=new Test(){
           public  void show(){
                System.out.println("Overriding show() called");
            }
        };

        Test t2=new Test(){
            public void show(){
                
                System.out.println("Overriding show() 2 called ");
            }
        };

        t1.show();
        t2.show();
    }
}
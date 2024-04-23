class Abc{
    public void printAbc(){
        System.out.println("Abc");
    }
}
class Pqr extends Abc{
    public void printPqr(){
        System.out.println("Pqr");
    }
}
class Xyz extends Pqr{
    public void printXyz(){
        System.out.println("Xyz");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Xyz obj=new Xyz();
        obj.printAbc();
        obj.printPqr();
        obj.printXyz();
    }
}

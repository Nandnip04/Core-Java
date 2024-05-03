import java.util.HashSet;

class Test{
    int id;
    String name;
    String branch;
    public Test(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    
}

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet <Test> h=new HashSet<Test>();
        Test t1=new Test (5,"Nandni","CS");
        Test t2=new Test(2,"Pihu","EE");
        Test t3=new Test(7,"Siya","EC");

        h.add(t1);
        h.add(t2);
        h.add(t3);

        for(Test ele:h){
            System.out.println("Employee id :"+ele.id+" , Employee Name : "+ele.name+", Employee Branch : "+ele.branch);
        }

    }
}

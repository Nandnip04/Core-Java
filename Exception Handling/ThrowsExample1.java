class AgeException extends Exception {
    AgeException(String message){
        super(message);
    }
}

class Voter{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void chackAge() throws AgeException{
        if(age<18){
            throw new AgeException(name+" is not eligible for voting as age <18");
        }
        else{
            System.out.println(name+" is eligible for voting");
        }
    }
}
public class ThrowsExample1{
    public static void main(String[] args) {
        Voter v1=new Voter("nandni", 21);
        Voter v2=new Voter("pihu",8);
        try{
            v1.chackAge();
            v2.chackAge();
        }
        catch(AgeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

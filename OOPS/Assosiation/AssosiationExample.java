class Address{
    String state;
    String city;
    String district;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public Address(String state, String city, String district) {
        this.state = state;
        this.city = city;
        this.district = district;
    }
    
}

class Student {
   private int id;
   private String name;
   private Address address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Student(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Student id:"+id +" "+" name :"+name);
        System.out.println("Address :"+address.city+" "+address.state+" "+address.district);
    }
    
}

public class AssosiationExample {
    public static void main(String[] args) {
        Address add1=new Address("MP", "Arud", "Khandwa");
        Address add2=new Address("MP", "Pandhana", "Khandwa");

        Student stu1=new Student(1, "Nandni", add2);
        Student stu2=new Student(2, "Bhumi", add2);

        stu1.display();
        stu2.display();
    }
}

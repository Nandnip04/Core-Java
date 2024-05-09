import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductDemo{
	int pid;
	String name;
	double price ;
	String address;
	public ProductDemo(int sid, String name, double price) {
		this.pid = sid;
	    this.name = name;
		this.price=price;
	}
	
}

public class StreamMapDemo {

	public static void main(String[] args) {
		List<ProductDemo> product =new ArrayList<ProductDemo>();
		product.add(new ProductDemo(1,"laptop",70000.20));
		product.add(new ProductDemo(2,"Freez",50000));
		product.add(new ProductDemo(3,"cooler",20000));
		product.add(new ProductDemo(3,"Mobile",50000));
		
		
		List<Double> pricelist=product.stream()
                           .filter(p->p.price>=50000) //Filtering
                           .map(m->m.price).  //fetching
                           collect(Collectors.toList());
		System.out.println(pricelist);
		
		             
		
		

	}

}

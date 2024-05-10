import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamDemo {
    public static void main(String[] args) {
        
        //list of integer
        List <Integer> number=List.of(1,2,3,4,5);

        //map()
        List<Integer> square=number.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(square);

        System.out.println("-----------------------");

        //List of String 
        List <String> names=List.of("radha","krishna","siya","pihu","kesav");
        //filter()
        List <String> nameList=names.stream().filter(n->n.startsWith("k")).collect(Collectors.toList());
        System.out.println(nameList);

        System.out.println("------------------------");

        //sorted()
        List<String> sortedList=names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("-----------------------");

        //List of Integer 
        List <Integer> num=List.of(2,3,4,3,1,5,7,4);

        //collect method return a set
        Set<Integer> squareList=num.stream().map(n->n*n).collect(Collectors.toSet());
        System.out.println(squareList);

        System.out.println("---------------------");

        //forEach()
        num.stream().map(n->n*n).forEach(x->System.out.println(x));
    }

}

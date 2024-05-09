import java.util.*;
import java.util.stream.Collectors;
public class StreamFilterDemo {
    public static void main(String[] args) {
        
        List <String> list =List.of("nandni","pihu","purvi","luckey","hardik");
        List <String> names=list.stream().filter(n->n.endsWith("i")).collect(Collectors.toList());
        System.out.println(names);

    }
}

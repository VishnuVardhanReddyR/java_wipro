import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Enumeration;

public class VectorList {
    public static void main(String[] args){
        List<Integer> vec = new Vector<>();
        vec.add(67);
        vec.add(76);
        vec.add(64);
        vec.add(6);
        Iterator<Integer> iterator = vec.iterator();
        while(iterator.hasNext()){
            int val = iterator.next();
            System.out.println(val);
        }

        for(int val : vec){
            System.out.println(val);
        }
        

        vec.forEach(System.out::println);
    }
}

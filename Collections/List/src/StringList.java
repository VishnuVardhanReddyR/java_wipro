import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringList {
    public static void main(String[] args){
        List<String> array = new ArrayList<>();
        array.add("red");
        array.add("green");
        array.add("blue");
        array.add("yellow");
        printAll(array);
    }
    public static void printAll(List arr){
        for(Object ele : arr){
            System.out.println(ele);
        }
        Iterator<String> iterator = arr.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

    }
}

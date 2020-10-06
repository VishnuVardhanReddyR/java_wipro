import java.util.ArrayList;
import java.util.List;

public class NumericList {
    public static void main(String[] args){
        List<Object> list = new myArrayList();
        try {
            list.add(15);
            list.add(1.2F);
            list.add(3.1415D);
//			list.add("Test");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}

class myArrayList extends ArrayList{
    @Override
    public boolean add(Object o) {
        if(o instanceof Integer || o instanceof Float || o instanceof Double){
            return super.add(o);
        }
        else{
            throw new ClassCastException("only integer, float, and double values are supported.");
        }
    }
}

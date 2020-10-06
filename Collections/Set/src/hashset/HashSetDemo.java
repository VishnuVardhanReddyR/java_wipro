package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
        HashSet<String> set = new HashSet<>();
        public HashSet<String> addCountry(String country){
            set.add(country);
            return set;
        }

        public String getCountry(String country){
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                if (iterator.next().equals(country)){
                    return "yes " + country + " is added";
                }
            }
            return "no " + country + "is added";
        }
}

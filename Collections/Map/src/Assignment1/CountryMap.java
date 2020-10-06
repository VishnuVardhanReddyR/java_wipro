package Assignment1;

import java.util.*;

public class CountryMap {
    Map<String,String> countrycap = new HashMap<>();
    public void SaveCountryCapital(String country, String capital){
        countrycap.put(country,capital);
    }
    public String getCapital(String country){
        return countrycap.get(country);
    }
    public String getCountry(String capital){
        return countrycap.get(capital);
    }

    public HashMap<String,String> iterateThrough(){
        HashMap<String,String> mapobj = new HashMap<>();
        Set<Map.Entry<String, String>> set = countrycap.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            mapobj.put(me.getValue(), me.getKey());
        }
        return mapobj;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> list = new ArrayList<>();

        Set<Map.Entry<String, String>> set = countrycap.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            list.add(me.getKey());
        }

        return list;
    }

}

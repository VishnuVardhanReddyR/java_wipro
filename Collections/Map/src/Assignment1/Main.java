package Assignment1;

public class Main {
    public static void main(String[] args){
        CountryMap map = new CountryMap();
        map.SaveCountryCapital("Telangana","Hyderabad");
        map.SaveCountryCapital("India","Delhi");
        map.SaveCountryCapital("Japan","Tokyo");

        System.out.println(map.getCapital("India"));
        System.out.println(map.getCapital("Telangana"));
        System.out.println(map.getCapital("Japan"));

        System.out.println(map.getCountry("Delhi"));
        System.out.println(map.getCountry("Hyderabad"));
        System.out.println(map.getCountry("Tokyo"));


    }
}

package hashset;

public class Main {
    public static void main(String[] args){
        HashSetDemo countries = new HashSetDemo();
        countries.addCountry("India");
        countries.addCountry("USA");
        countries.addCountry("Pakistan");
        countries.addCountry("Bangladesh");
        countries.addCountry("China");

        System.out.println("China: " + countries.getCountry("China"));
        System.out.println("Japan: " + countries.getCountry("Japan"));
    }
}

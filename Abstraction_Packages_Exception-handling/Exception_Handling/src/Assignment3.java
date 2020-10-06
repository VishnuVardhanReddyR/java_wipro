import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student = 0;
        try {
            while ( student < 2) {
                String name;
                int subA;
                int subB;
                int subC;

                name = sc.nextLine();

                if (sc.hasNextInt()) {
                    subA = sc.nextInt();
                }
                else {
                    throw new NumberFormatException();
                }
                if (sc.hasNextInt()) {
                    subB = sc.nextInt();
                }
                else {
                    throw new NumberFormatException();
                }
                if (sc.hasNextInt()) {
                    subC = sc.nextInt();
                }
                else {
                    throw new NumberFormatException();
                }

                if (subA < 0) throw new IllegalArgumentException();
                if (subA > 100) throw new IllegalArgumentException();

                if (subB < 0) throw new IllegalArgumentException();
                if (subB > 100) throw new IllegalArgumentException();

                if (subC < 0) throw new IllegalArgumentException();
                if (subC > 100) throw new IllegalArgumentException();

                System.out.println("Name: " + name);
                System.out.println("Marks of subject A: " + subA);
                System.out.println("Marks of subject B: " + subB);
                System.out.println("Marks of subject C: " + subC);

                student++;
            }
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());;
        }
    }
}

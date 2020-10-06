import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        try {
            int size = Integer.parseInt(sc.next());
            int[] intArray = new int[size];
            System.out.println("Enter the array elements ");
            for(int i = 0;i < size;i++) {
                intArray[i] = Integer.parseInt(sc.next());
            }
            System.out.println("Enter the index of the array element you want to access");
            int key = Integer.parseInt(sc.next());
            System.out.println("The array element at index " + key + " = " + intArray[key]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}

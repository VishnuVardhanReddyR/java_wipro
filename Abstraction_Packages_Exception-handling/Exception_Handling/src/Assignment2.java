import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        try {
            int size = args.length;
            int[] intArray = new int[size];
            System.out.println("the " + size + " array elements are :");
            for(int i = 0;i < size;i++) {
                intArray[i] = Integer.parseInt(args[i]);
                System.out.println(intArray[i]);
            }
            int sum = 0;
            for(int i = 0;i < size;i++){
                sum += intArray[i];
            }
            System.out.println("sum is " + sum + ", average is " + (double) sum/size);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}

public class NumToBinary {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);

        System.out.println("Given Number            : " + num);
        System.out.println("Binary Equivalent       : " + Integer.toBinaryString(num));
        System.out.println("Octal Equivalent        : " + Integer.toOctalString(num));
        System.out.println("Hexa-Decimal Equivalent : " + Integer.toHexString(num));
    }
}

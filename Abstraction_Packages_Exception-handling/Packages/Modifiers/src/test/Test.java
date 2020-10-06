package test;
public class Foundation {
    private int var1;
    int var2;
    protected int var3;
    public int var4;
}

public class Test {
    public static void main(String[] args){
        Foundation f = new Foundation();
        System.out.println("var2, var3, var4 =" + f.var2 + f.var3 + f.var4);
    }
}
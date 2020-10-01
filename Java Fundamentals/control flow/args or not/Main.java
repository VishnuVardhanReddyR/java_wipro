
public class Main {

    public static void main(String[] args) {
		if(args[0] == null){
			System.out.println("no values");			
		}
		else{
			for(int i=0; i < args.length; i++){
				System.out.println(args[i]);
			}		
		}
    }
}
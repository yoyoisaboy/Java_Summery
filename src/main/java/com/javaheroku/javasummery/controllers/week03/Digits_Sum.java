import java.util.ArrayList;
import java.util.Scanner;

public class Digits_Sum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            
            Long target = input.nextLong(); 
            System.out.println( Math.max( (int)(target+1)/10 , target/10) );
            
        }

    }
}

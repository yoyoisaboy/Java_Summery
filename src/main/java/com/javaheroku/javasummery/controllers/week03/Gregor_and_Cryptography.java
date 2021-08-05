import java.util.Scanner;

public class Gregor_and_Cryptography {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            
            Long target = input.nextLong(); 
            if(target%2!=0) target-=1;
            System.out.println(2+" "+target);
        }
    }
    
}

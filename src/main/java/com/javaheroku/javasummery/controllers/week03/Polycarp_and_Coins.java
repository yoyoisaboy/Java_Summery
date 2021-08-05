import java.util.Scanner;

public class Polycarp_and_Coins {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            
            Long target = input.nextLong(); 
            if(target%3==1) System.out.println(target/3+1+" "+target/3);
            else if (target%3==2) System.out.println(target/3+" "+(target/3+1));
            else System.out.println(target/3+" "+target/3);
            
        }

    }
}

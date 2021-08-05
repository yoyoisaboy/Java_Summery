import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt(); 
        
        while(count-->0){
            
            int target = input.nextInt(); 
            int odd_count = 0,even_count=0;
            target *= 2;
            while(target-->0){
                int value = input.nextInt(); 
                if(value%2==0) even_count++;
                else odd_count++;
            }
            if(odd_count==even_count) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}

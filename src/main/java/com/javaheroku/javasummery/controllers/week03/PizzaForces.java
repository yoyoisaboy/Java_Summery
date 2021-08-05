import java.util.Scanner;

public class PizzaForces{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            
            Long target = input.nextLong(); 

            System.out.println(Math.max(6L,target+1)/2*5);

        }

    }
}
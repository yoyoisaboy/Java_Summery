import java.util.ArrayList;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1328/A
public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        ArrayList<Integer> map = new ArrayList<Integer>();
        while(count-->0){
            
            Integer a = input.nextInt(); 
            Integer b = input.nextInt(); 
            if(b>a){
                System.out.println(b-a);
                
            }
            else{
                if(a%b==0) System.out.println(0);
                else {
                    int temp = (int)a/b;
                    System.out.println(b*(temp+1)-a);
                }    
            }
            
        }
    }
}

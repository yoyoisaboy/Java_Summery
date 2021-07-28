import java.util.ArrayList;
import java.util.Scanner;
//https://codeforces.com/problemset/problem/1348/A
public class Phoeni_and_Balance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            int a=0,b=0;
            ArrayList<Integer> map = new ArrayList<Integer>();
            Integer target = input.nextInt(); 
            for(int i =0;i<target;i++) map.add((int)Math.pow(2, i+1));
            for(int i =0;i<target-1;i++) {

                if(target/2-1>i){
                    a += map.get(i);
                }
                else{
                    b+=map.get(i);
                }
            }
            a += map.get(target-1);
            System.out.println(Math.abs(a-b));
        }
        
        
    }
}

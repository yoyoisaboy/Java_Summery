//package week02_save8problem;
 
import java.util.ArrayList;
import java.util.Scanner;
 //https://codeforces.com/problemset/problem/1550/A
public class A_Find_the_array {
    public static int ans_method(int target_number) {
        int ans=0;
        int size = 0;
        int oringal_number=1;
        while(target_number>ans){
            size++;
            ans+=oringal_number; 
            oringal_number+=2;
        }
        return size;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        ArrayList<Integer> map = new ArrayList<Integer>();
        while(count>0){
            
            Integer target = input.nextInt(); 
            map.add(target);
            count--;
        }
        for(int i =0;i<map.size();i++){
            System.out.println( ans_method( map.get(i)) );
        }
        
    }
}
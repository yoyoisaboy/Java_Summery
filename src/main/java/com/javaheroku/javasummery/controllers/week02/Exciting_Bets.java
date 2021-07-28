import java.util.*;
//https://codeforces.com/problemset/problem/1543/A
public class Exciting_Bets {                          
 public static void main(String[] args) {
        long  a,b;
        Scanner sc=new Scanner(System.in);
        long  input_count=sc.nextInt();

        while(input_count-->0){
            
            a=sc.nextLong();
            b=sc.nextLong();
            if(a>b){ //左小右大
                long temp = b;
                b=a;
                a=temp;
            }
            long ans = b-a;
            if(ans == 0) System.out.println("0 0");
            else{
                long one = (ans-a%ans);
                long two = a%ans;
                System.out.println(ans+" "+Math.min(one, two));
            }

        }
 }

}
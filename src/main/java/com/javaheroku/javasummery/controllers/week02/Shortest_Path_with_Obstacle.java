
import java.util.ArrayList;
import java.util.Scanner;
//https://codeforces.com/problemset/problem/1547/A
public class Shortest_Path_with_Obstacle {
    public static int ans_method(ArrayList<ArrayList<Integer>> map){
        //map[0]->A,map[1]->B,map[2]->F
        int A_x = map.get(0).get(0), A_y = map.get(0).get(1);
        int B_x = map.get(1).get(0), B_y = map.get(1).get(1);
        int F_x = map.get(2).get(0), F_y = map.get(2).get(1);
        int step_sum = 0;
        if(A_x == F_x && B_x == F_x){
            if( (A_y < F_y && F_y < B_y) || (A_y > F_y && F_y > B_y) ) step_sum += (Math.abs(B_x-A_x)+Math.abs(B_y-A_y)+2);
            else step_sum += (Math.abs(B_x-A_x)+Math.abs(B_y-A_y));
        }
        else if(A_y == F_y && B_y == F_y){
            if((A_x < F_x && F_x < B_x) || (A_x > F_x && F_x > B_x)) step_sum += (Math.abs(B_x-A_x)+Math.abs(B_y-A_y)+2);
            else step_sum += (Math.abs(B_x-A_x)+Math.abs(B_y-A_y));
        }
        else{
            step_sum += (Math.abs(B_x-A_x)+Math.abs(B_y-A_y));
        }
        //System.out.println( step_sum );
        return step_sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        ArrayList<Integer> ans_map = new ArrayList<>(count);
        while(count-->0){
            ArrayList<ArrayList<Integer>> map = new ArrayList<>(3);
            String enter = input.nextLine();
            for(int i=0; i < 3; i++) {
                map.add(new ArrayList());
            }
            for(int i=0;i<3;i++){
                Integer x = input.nextInt();
                Integer y = input.nextInt();
                map.get(i).add(x);
                map.get(i).add(y);
            }
            //method
            ans_map.add(ans_method(map));
        }
        for(int i=0;i<ans_map.size();i++){
            System.out.println( ans_map.get(i) );
        }  
        
    }
}



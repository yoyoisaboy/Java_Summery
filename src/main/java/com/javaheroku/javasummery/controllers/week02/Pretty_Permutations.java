import java.util.*;
//https://codeforces.com/problemset/problem/1541/A
public class Pretty_Permutations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  input_count=sc.nextInt();

        while(input_count-->0){
            long cat_cost = sc.nextInt();
            if(cat_cost==1){
                System.out.println("1");
                break;
            }
            ArrayList<Long> cat_map = new ArrayList<Long>();
            
            
            for(long i =0;i<cat_cost;i++){
                cat_map.add(i+1);
            }
            if(cat_cost%2==0){ //odd
                List<Long> subList = cat_map.subList(0, (int)cat_cost);
                cat_move(subList);
            }
            else{ //even
                
                System.out.print("3 1 2 ");
                List<Long> subList = cat_map.subList(3, (int)cat_cost);
               
                if(cat_map.size()>3){
                    cat_move(subList);     
                }
                    
            }
            
        }
    }
    public static void cat_move(List<Long> map){
        for(int i = 0;i<map.size()-2;i+=2){
            Collections.swap(map, i, i+1);
            System.out.print(map.get(i)+" "+map.get(i+1)+" ");
        }
        Collections.swap(map, map.size()-2, map.size()-1);
        System.out.print(map.get(map.size()-2)+" "+map.get(map.size()-1));
        System.out.println();
    }
}
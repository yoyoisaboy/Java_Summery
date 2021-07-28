import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.List;

//https://codeforces.com/problemset/problem/1545/A
public class AquaMoon_and_Strange_Sort {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        while(count-->0){
            
            Integer map_size = input.nextInt(); 
            Map<Integer, List<Integer> > input_map = new LinkedHashMap<Integer, List<Integer> >();
            ArrayList<Integer> sort_array = new ArrayList<Integer>(map_size);
            //紀錄初始bool 和 值
            for(int i =0;i<map_size;i++){
                Integer friend = input.nextInt();
                sort_array.add(friend);
                put_samekey( input_map, friend , i%2  );
            }
            Map< Integer, List<Integer> > map = new TreeMap< Integer, List<Integer> >(input_map);
            //System.out.println(map.toString());
            
            //key，value排序(小到大)
            Collections.sort(sort_array);
            Map<Integer, List<Integer> > input_sort_map = new LinkedHashMap<Integer, List<Integer> >();
            for(int i =0;i<map_size;i++){
                put_samekey( input_sort_map, sort_array.get(i) , i%2  );
            }
            Map< Integer, List<Integer> > sort_map = new TreeMap< Integer, List<Integer> >(input_sort_map);
            
            //System.out.println(sort_map.toString());
            
            //Map取values->2維陣列
            List<List<Integer>> map_Array = new ArrayList<List<Integer>>(map.values());
            List<List<Integer>> sort_map_Array = new ArrayList<List<Integer>>(sort_map.values());
            for(int i=0 ; i<sort_map_Array.size() ; i++){
                List<Integer> temp1 = map_Array.get(i);
                Collections.sort( temp1 , new Comparator<Object>(){
                    public int compare( Object l1, Object l2 )
                    {
                        // 回傳值: -1 前者比後者小, 0 前者與後者相同, 1 前者比後者大
                        return l1.toString().toLowerCase().compareTo(l2.toString().toLowerCase());
                    }
                });
                map_Array.set( i , temp1 );
                List<Integer> temp2 = sort_map_Array.get(i);
                Collections.sort( temp2 , new Comparator<Object>(){
                    public int compare( Object l1, Object l2 )
                    {
                        // 回傳值: -1 前者比後者小, 0 前者與後者相同, 1 前者比後者大
                        return l1.toString().toLowerCase().compareTo(l2.toString().toLowerCase());
                    }
                });
                sort_map_Array.set( i , temp2 );
            }
            
            
            // System.out.println(map_Array.toString());
            // System.out.println(sort_map_Array.toString());

            ArrayList<Integer> orignal_array = new ArrayList<Integer>(map_size);
            ArrayList<Integer> temp_sort_array = sort_array; // 篩選重複元素
            sort_array.clear();

            //2維轉一維
            for(int i =0;i<map_Array.size();i++){
                for(int j =0;j<map_Array.get(i).size();j++){
                    orignal_array.add(map_Array.get(i).get(j));
                }
            }
            for(int i =0;i<sort_map_Array.size();i++){
                for(int j =0;j<sort_map_Array.get(i).size();j++){
                    sort_array.add(sort_map_Array.get(i).get(j));
                }
            }

            //確認兩邊陣列一致
            int sum = 0;
            
            for(int i =0;i<map_size;i++){
               
               sum += Math.abs(orignal_array.get(i)-sort_array.get(i));
                
            }
            // System.out.println(orignal_array.toString());
            // System.out.println(sort_array.toString());
            // System.out.println(sum);
 
            if(sum==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
            
            map.clear();
            sort_map.clear();
            
        }

        
    }
    public static void put_samekey(Map<Integer, List<Integer> > map, Integer key, Integer value) {
        if (map.get(key) == null) {
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else {
            map.get(key).add(value);
        }
    }
    

    
}


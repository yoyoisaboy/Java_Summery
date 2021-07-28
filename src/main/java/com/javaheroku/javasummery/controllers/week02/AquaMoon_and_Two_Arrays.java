import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
//https://codeforces.com/problemset/problem/1546/A
public class AquaMoon_and_Two_Arrays {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        while(count-->0){
            int sum_a=0,sum_b=0,dif_sum=0;
            Integer map_size = input.nextInt(); 
            ArrayList<Integer> map_a = new ArrayList<Integer>(map_size);
            ArrayList<Integer> map_b = new ArrayList<Integer>(map_size);
            ArrayList<Integer> map_dif = new ArrayList<Integer>(map_size);
            for(int i=0;i<map_size;i++){
                Integer values = input.nextInt();
                map_a.add(values);   
                sum_a+=values; 
            }
            for(int i=0;i<map_size;i++){
                Integer values = input.nextInt();
                map_b.add(values);  
                sum_b+=values; 
                map_dif.add(map_a.get(i)-values); //紀錄差值
                dif_sum += Math.abs(map_a.get(i)-values);  //記錄總次數用
            }
            
            if(sum_a!=sum_b) System.out.println( "-1" );
            else{
                System.out.println(dif_sum/2);
                for(int i=0;i<dif_sum/2;i++){

                    for(int j=0;j<map_size;j++){ //大於0的-1
                        if(map_dif.get(j)>0){
                            map_dif.set( j , map_dif.get(j)-1 ); //改值
                            System.out.print( (j+1) +" ");
                            break;
                        }
                    }

                    for(int j=0;j<map_size;j++){//小於0的+1
                        if(map_dif.get(j)<0){
                            map_dif.set( j , map_dif.get(j)+1 );
                            System.out.println( (j+1) +" ");
                            break;
                        }
                    }
                }
            }
        }
    }
}


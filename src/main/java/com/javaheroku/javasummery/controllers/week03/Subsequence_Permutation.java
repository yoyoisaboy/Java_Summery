import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.HTML.Tag;

public class Subsequence_Permutation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer count = Integer.parseInt(input.nextLine());
        
        while(count-->0){
            
            Integer target = Integer.parseInt(input.nextLine());
            String str = input.nextLine();
            
            int dif_count=0;
            char charArray[] = str.toCharArray();
            char temp[] = str.toCharArray();
            
            Arrays.sort(charArray);

            for(int i =0;i<target;i++){
                if(charArray[i]!=temp[i])  dif_count+=1;
            }
            System.out.println(dif_count); 
        }

    }
}

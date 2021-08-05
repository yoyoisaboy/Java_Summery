
import java.util.ArrayList;
import java.util.Scanner;


public class Cherry {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt(); 
        
        while(count-->0){
            
            Long target = input.nextLong(); 
            ArrayList<Long> map = new ArrayList<Long>();
            while(target-->0){
                Long value = input.nextLong(); 
                map.add(value);
            }
            Long max=0L;
            for(int i =0;i<map.size()-1;i++){
                Long plex = map.get(i) * map.get(i+1);
                if(max<plex) max = plex;

            }
            System.out.println(max);
        }

    }
}

package basic;
import java.util.*;
public class HAshMap {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        int N = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<N;i++){
           al.add(sc.nextLine());
        }
        int k = sc.nextInt();
        for(int z=0;z<N;z++){
            if(!map.containsKey(al.get(z))){
                map.put(al.get(z),0);
            }
            else{
                map.put(al.get(z),map.get(al.get(z)+1));
            }
        }
        int c =0;
       while(c<map.size()){
       if(map.get(al.get(c))!=1){
         map.remove(al.get(c));
       }
       }
    System.out.println(map.keySet().toArray()[k-1]);
    sc.close();
    }
}

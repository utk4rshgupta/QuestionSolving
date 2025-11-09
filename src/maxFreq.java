import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class maxFreq {
    public static void main(String[] args) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int arr[]  = new int[]{1,2,3,4,5,5,3,2,1,1,1,1,1,1};
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
        }
//        int maxVal = Collections.max(freq.values());
//        System.out.println(maxVal);
//        System.out.println(Collections.max(freq.values()));
    }
}

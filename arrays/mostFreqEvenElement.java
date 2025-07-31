import java.util.HashMap;
import java.util.Map;

public class mostFreqEvenElement {
    public int mostFrequentEven(int[] nums) {
        
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int el=nums[i];
            if(el%2==0){
                    mp.put(el,mp.getOrDefault(el,0)+1);
            }
        }
        int mostFrequentEven = -1; 
        int maxFrequency = -1;
        for(Map.Entry<Integer,Integer>it:mp.entrySet()){
            int currentEntry=it.getKey();
            int currentFreq=it.getValue();
            if(currentFreq>maxFrequency){
                maxFrequency = currentFreq;
                mostFrequentEven=currentEntry;
            }
            else if (currentFreq == maxFrequency) {
                if (currentEntry < mostFrequentEven) { 
                    mostFrequentEven = currentEntry;   
                }
            }
        }  
        return mostFrequentEven;  
    }
}

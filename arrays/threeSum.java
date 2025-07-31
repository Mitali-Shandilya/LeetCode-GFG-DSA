import java.util.*;
public class threeSum{
    public List<List<Integer>> ThreeSum(int[] nums, int n){
    Set<List<Integer>> st=new HashSet<>();
    for(int i=0;i<n;i++){
        Set<Integer> mp=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int rem=-(nums[i]+nums[j]);
            if(mp.contains(rem)){
                List<Integer> temp=Arrays.asList(nums[i],nums[j],rem);
                temp.sort(null);
                st.add(temp);
            }
            else{
                mp.add(nums[j]);
            }
        }
    }
    List<List<Integer>> ans=new ArrayList<>(st);
    return ans;
}}
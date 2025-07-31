public boolean twoSum(int[] nums, int k){
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int rem=k-nums[i];
        if(mp.contains(rem)){
            return yes;
        }
        else{
            mp.put(nums[i], i);
        }
    }
    return false;
}

//variant 2: return the indices if pair existing else return [-1,-1]
public int[] twoSum2(int[] nums, int k){
    int[] ans={-1,-1};
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int rem=k-nums[i];
        if(mp.contains(rem)){
            ans[0]=mp.get(rem);
            ans[1]=i;
            return ans;
        }
        else{
            mp.put(nums[i],i);
        }
    }
    return ans;
}
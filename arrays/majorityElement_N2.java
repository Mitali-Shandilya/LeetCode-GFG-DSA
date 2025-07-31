public class majorityElement_N2 {
    //MOORE'S VOTING ALGORITHM
    //need to return the majority element that appears more than n/2 times
    public int majorityElement(int[] nums, int n){
        int el=0,c=0;
        for(int i=0;i<n;i++){
            if(c==0){
                el=nums[i];
                c=1;
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        //check if el is majority element
        int c1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                c1++;
            }
        }
        if(c1>=(n/2)){
            return el;
        }
        return -1;
    }
}

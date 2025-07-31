//DUTCH NATIONAL FLAG ALGORITHM 
//tc: o(n)
//sc: o(1)
public class sort0_1_2 {
    public static void Sort012(ArrayList<Integer>nums, int n){
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(nums.get(m)==0){
                int t=nums.get(l);
                nums.set(l,nums.get(m));
                nums.set(m,t);
                l++;
                m++;
            }
            else if(nums.get(m)==1){
                m++;
            }
            else{
                int t=nums.get(h);
                nums.set(h,nums.get(m));
                nums.set(m,t);
                h--;
            }
        }
    }
}

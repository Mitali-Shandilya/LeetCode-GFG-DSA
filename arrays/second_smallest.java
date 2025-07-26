//find the second smallest element in an array
static private int second_smallest(int[] arr){
    int smallest=Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            secondSmallest=smallest;
            smallest=arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i]!=smallest){
            secondSmallest=arr[i];
        }
    }
    return secondSmallest;
}

//move all zeroes at the end
public static int[] moveZeroesToEnd(int[] arr){
    int j=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            j=i;
            break;
        }
    }
    if(j==-1){      //no zeroes 
        return arr;
    }
    for(int i=j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            j++;
        }
    }
    return arr;
}
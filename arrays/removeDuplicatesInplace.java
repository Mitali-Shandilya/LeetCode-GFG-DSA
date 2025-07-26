package arrays;
public //remove duplicates from array (in-place)...    TWO POINTER
static int removeDup(int[] arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
        }
    }
    return i+1;
} {
    
}

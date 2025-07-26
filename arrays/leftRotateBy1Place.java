package arrays;

public //left rotate an array by 1 place
static int[] leftRotate(int[] arr){
    int t=arr[0];
    for(int i=1;i<arr.length-1;i++){
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=t;
    return arr;
}
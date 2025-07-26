package arrays;
public //rotate an array by D places right
public static void rotateRight(int[] arr, int k){
    int n=arr.length;
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-k-1);
    reverse(arr,0,n-1);
}
public static reverse(int[] arr, int s, int e){         //reverse an array recursively
    while(s<r=e){
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
        s++;
        e--;
    }
}

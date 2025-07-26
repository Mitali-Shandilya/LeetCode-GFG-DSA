//find the greatest element in an array
public static int Largest_element(int[] arr){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i]
        }
    }
    return max;
}
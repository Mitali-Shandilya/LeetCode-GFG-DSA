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

//find the second greatest element in an array
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

static private int second_largest(int[] arr){
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondLargest && arr[i]!=largest){
            secondLargest=arr[i];
        }
    }
    return secondLargest;
}

//CHECK IF AN ARRAY IS SORTED
static boolean isSorted(int[] arr){
    for(int i=0;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            return false;
        }
        return trus;
    }
}

//remove duplicates from array (in-place)...    TWO POINTER
static int removeDup(int[] arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
        }
    }
    return i+1;
}

//left rotate an array by 1 place
static int[] leftRotate(int[] arr){
    int t=arr[0];
    for(int i=1;i<arr.length-1;i++){
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=t;
    return arr;
}

//rotate an array by D places right
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

//rotate an array by D places left
public static void rotateRight(int[] arr, int k){
    int n=arr.length;
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    reverse(arr,0,n-1);
}

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

//UNION OF TWO SORTED ARRAYS
static ArrayList<Integer> findUnion(int[] a, int[] b){
    int n=a.length;
    int m=b.length;
    int i=0,j=0;
    while(i<n && j<m){
        if(a[i]<=b[j]){
            if(u.size()==0 || (u.get(u.size()-1)!=a[i])){
                u.add(a[i]);
            }
            i++;
        }
        else{
             if(u.size()==0 || (u.get(u.size()-1)!=b[j])){
                u.add(a[j]);
            }
            j++;
        }
    }
    while(i<n){
        if(u.get(u.size()-1)!=a[i]){
            u.add(a[i]);
        }
        i++;
    }
    while(j<m){
        if(u.get(u.size()-1)!=b[j]){
            u.add(b[j]);
        }
        j++;
    }
    return u;
}

//
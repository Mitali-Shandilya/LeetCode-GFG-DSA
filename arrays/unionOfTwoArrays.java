package arrays;
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
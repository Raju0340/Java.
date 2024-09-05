public class mergesort {
    
   public static void MergeSort(int[] arr,int si,int ei){
    int mid =( si+ei )/ 2;
      if(si>=ei){
    return;
   }
    MergeSort(arr, si, mid);
    MergeSort(arr, mid+1, ei);
    Merge(arr,si,mid,ei);
   }

    private static void Merge(int[] arr, int mid ,int si, int ei) {
        int [] temp = new int[arr.length+1];
        int i = si;
        int j = mid;
        int k=0;
       while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k] = arr[i]; 
        i++;      }
         else{
             temp[k] = arr[j];
             j++;
         }
         k++;

       }
       while(i<=mid){
        temp[k++]=arr[i++];
       }
       while(j<=ei){
        temp[k++]=arr[j++];
       }

  for(int z =0 ;z<temp.length;z++){
    System.out.println(temp[z]);
  }

    }
    public static void main(String[] args) {
       int[] arr = {4,5,1,2,3};
       MergeSort(arr,0,arr.length);
    }
}

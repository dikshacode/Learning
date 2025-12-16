package sorting;

public class CountPairs {

    public static void main(String[] arr){
        int[] ar ={3, 2, 4, 5, 1, 20}; //{8, 4, 2, 1};
        int[] temp = new int[ar.length];
        int l = 0; int r = ar.length-1;
        int count = mergeSort(ar,temp,l,r);
        System.out.println(count+",");
        for(int a: ar){
            System.out.println(a+",");
        }
    }
    public static int  mergeSort(int[] arr,int[] temp,int l,int r){
        int mid = 0; int count =0;
        if(l==r)
            return count;
        mid = (l + r) / 2;
        count += mergeSort(arr,temp,l,mid);
        count += mergeSort(arr,temp,mid+1,r);
        count += countPair(arr,l,r,mid);
        merge(arr,temp,l,mid+1 ,r);
        return count;
    }
    public static int countPair(int[] arr, int low,int end,int mid){
        int count = 0; int right = mid +1;
        for(int i = low; i <= mid; i++){
            while(low < right && (arr[low] > 2 * arr[right])){
                right++;
            }
            count += right - (mid + 1);
        }
        return count;
    }
    public static void merge(int[] arr,int[] temp,int l,int mid,int r) {
        int a = l; int b = mid; int c =l;

        while(a <= mid-1 && b <= r){
            if(arr[a] <= arr[b]){
                temp[c++] = arr[a++];
            }
            else{
                temp[c++] = arr[b++];
            }
        }
        while(a <= mid-1){
            temp[c++] = arr[a++];
        }

        while(b <= r){
            temp[c++] = arr[b++];
        }

        for(int i = 0; i<= r; i++){
            arr[i] = temp[i];
        }
    }

}

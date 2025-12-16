package sorting;

public class InversionCount {

    public static void main(String[] arr){
        int[] ar = {8, 4, 2, 1};
        int invCount =0;
        int[] temp = new int[ar.length];
        int l = 0; int r = ar.length-1;
        invCount =mergeSort(ar,temp,l,r);
            System.out.println(invCount);
    }
    public static int  mergeSort(int[] arr,int[] temp,int l,int r){
        int mid = 0;
        int invCount =0;
        if(l==r)
            return 0;
        mid = (l + r) / 2;

        invCount+=  mergeSort(arr,temp,l,mid);
        invCount+= mergeSort(arr,temp,mid+1,r);
        invCount+= merge(arr,temp,l,mid+1 ,r);
        return invCount;
    }
    public static int merge(int[] arr,int[] temp,int l,int mid,int r) {

        int a = l; int b = mid; int c =l;
        int invCount = 0;

        while(a <= mid-1 && b <= r){

            if(arr[a] <= arr[b]){
                temp[c++] = arr[a++];
            }
            else{
                temp[c++] = arr[b++];
                invCount += (mid - a);
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
        return invCount;
    }

}

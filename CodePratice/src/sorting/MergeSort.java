package sorting;

import java.util.Arrays;

public class MergeSort {

        public static void main(String[] arr){
        int[] ar ={1,3,2,3,1}; //{8, 4, 2, 1};
        int[] temp = new int[ar.length];
        int l = 0; int r = ar.length-1;
        mergeSort(ar,temp,l,r);
            for(int a: ar){
                System.out.println(a+",");
            }
        }
        public static void  mergeSort(int[] arr,int[] temp,int l,int r){
        int mid = 0;
            if(l==r)
                return;
        mid = (l + r) / 2;
       mergeSort(arr,temp,l,mid);
       mergeSort(arr,temp,mid+1,r);
        merge(arr,temp,l,mid+1 ,r);
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

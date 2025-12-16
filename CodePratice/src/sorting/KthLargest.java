package sorting;

public class KthLargest {
    static int KthLargest(int[]  input,int k){
        int n = input.length;
        for(int i=1;i<input.length;i++){
            int j = i-1;
            int curr = input[i];
            while(j>=0 && input[j] < curr){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] =curr;
        }
        return input[k-1];
    }
    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};
        System.out.println(KthLargest(arr,2));
    }
}

package Array;

public class Sort0123 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low =0;
        int i = 0;
        int high =arr.length-1;

        while (low <= high){
            if(arr[low]==0){
                swap(arr,low,i); low++;
            }
            else if(arr[low]==1){
                low++;i++;
            }
            else{
                swap(arr,low,high);
                high--;
            }
        }
    }
    static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] =  arr[high];
        arr[high] = temp;
    }
    public static void main(String[] args){
        int[] nums = {0, 1, 2, 2, 1, 0};
        sort012(nums);
    }
}


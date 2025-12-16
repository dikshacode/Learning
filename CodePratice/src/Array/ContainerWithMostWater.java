package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = arr.length-1;
        int maxWater =0;
        int dis =0;
        while(left < right){
            dis = right - left;
            int totalWater = dis * Math.min(arr[left],arr[right]);
            maxWater = Math.max(maxWater,totalWater);
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxWater);
    }
}

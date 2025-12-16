package SlidingWindow;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.print(findMostWater(height));
    }
    static int findMostWater(int[] height){
        int low = 0; int high = height.length-1;
        int maxWater = 0;
        while(low < high){

            int len = Math.min(height[low], height[high]);
            int distance = high - low;
            int total = distance * len;
            maxWater = Math.max(maxWater,total);
            if(height[low] < height[high])
                low++;
            else high--;
        }
        return maxWater;
    }
}

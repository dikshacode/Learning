package Array;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    public static List<int[]> twoSum(int[] nums, int target) {
            Map<Integer,Integer>map = new HashMap<Integer,Integer>();
            List<int[]> result = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                int num = nums[i];
                map.put(nums[i],i);
                if(map.containsKey(target-num))
                {
                    int[] pairs =  new int[]{nums[i],nums[map.get(target-num)]};
                    result.add(pairs);
                }

            }
            return result;

        }
    public static List<int[]> pairSum(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            // If complement exists, add that many pairs
            if (freq.containsKey(complement)) {
                int count = freq.get(complement);
                for (int i = 0; i < count; i++) {
                    int a = Math.min(num, complement);
                    int b = Math.max(num, complement);
                    result.add(new int[]{a, b});
                }
            }

            // Add current number to frequency map
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Sort pairs by first value, then by second
        result.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5 };//{2, -3, 3, 3, -2 };
        int target = 7;

        System.out.println(twoSum(nums,target));
    }
}

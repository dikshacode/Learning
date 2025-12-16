package BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int a: arr1) {
            sum1 += a;
        }
        for (int b: arr2) {
            sum2 += b;
        }
        int mid = (sum1 - sum2) / 2;

        Set<Integer> s2 = new HashSet<>();

        for (int b :arr2) {
            s2.add(b);
        }

        for (int v : arr1) {
            int d = v - mid;
            if (s2.contains(d)) {
                return new int[]{v, d};
            }
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args){
        int[] aliceSizes = {1,1}; int[] bobSizes = {2,2};
        System.out.println((fairCandySwap(aliceSizes,bobSizes).toString()));
    }
}

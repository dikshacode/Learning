package sorting;

public class CountSmallerNumberAfterSelf {
    static int[] countSmallerNumber(int[]  input){
        int[] output = new int[input.length];
        int n = input.length;
        for(int i = 0;i < n; i++) {
            int count =0;
            for(int j = i+1;j<n;j++){
                int a = input[i];
                int b = input[j];
                if( a > b){
                    count++;
                }
                output[i] = count;
            }
        }
        return output;
    }

    public static void main(String [] args){
        int[] arr = {5,2,6,1};
        countSmallerNumber(arr);
    }
}

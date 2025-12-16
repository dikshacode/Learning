package Array;

public class MoveAllZeroAtEnd {

    private static void moveZeros(int[] arr){

        int n = arr.length;
        int count = 0;
        for( int i = 0; i<n; i++){

            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        } //[10, 3, 5, 6, 2]-> 10,30,150,900,360
         // 180,60,12,2

    }
    public static void main(String[] args){
        moveZeros(new int[]{3, 5, 0, 0, 4});
    }
}

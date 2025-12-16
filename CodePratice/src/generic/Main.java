package generic;

public class Main {

    static int findFloorWithBinarySearch(int n ){
       int start = 1;
       int end = (int)Math.sqrt(n);
       int ans = 0;
       while (start <= end){
          int mid = (start+end)/2;
          int prd = mid*mid;
          if(prd < n){
              start = mid + 1;
          }
          if(ans < prd){
              ans = mid;
          }
       }
       return ans;
    }
    public static void main(String[] args) {
        System.out.print(findFloorWithBinarySearch(31));
    }
}
package Stack;

public class GasStation {
    public static void main(String[] args){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int index = -1;
        int fuel =0, totalDiff = 0;
        for(int i =0; i<gas.length;i++){
            int diff = gas[i] - cost[i];
            totalDiff += diff;
            fuel += diff;
             if(fuel < 0){
                 fuel = 0;
                 index = i+1;
             }
        }
        System.out.print(index);
    }
}

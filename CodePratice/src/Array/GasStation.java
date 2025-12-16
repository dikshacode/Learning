package Array;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int fuel =0;
        int index = 0;

        for(int i=0;i<n;i++)
        {
            int diff = gas[i] - cost[i];
            total = total + diff;
            fuel += diff;
            if(fuel<0)
            {
                index = i+1;
                fuel = 0;
            }

        }
        return(total<0)?-1:index;
    }
    public static void main(String[] atgs){
        int[] gas = {1,2,3,4,5}; int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}

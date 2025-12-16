package Array;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(); //1 3 4 2 2
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        System.out.println(findDuplicate(list,list.size()));
    }
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int i = 0;
        int dup = 0;
        for(int j=1; j < n; j++){
            if(arr.get(i)==arr.get(j))
                dup =  arr.get(i);
            else
                i++;
        }
        return dup;
    }
}

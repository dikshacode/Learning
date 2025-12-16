package hashing;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStone {
    public static void main(String[] args){
      String  jewels = "aA"; String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
    }
    public static  int numJewelsInStones(String jewels, String stones) {
        int count = 0; int end =0;
        Map<Character,Integer>map = new HashMap<>();
        for(char c : jewels.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
       char[] chArray = stones.toCharArray();
        while(end < chArray.length){
            char key = chArray[end++];
           if(map.containsKey(key))
               count += map.get(key);
        }
      return count;
    }
}

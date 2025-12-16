package hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {

    public static void main(String[] args){
        String str1 = "cat";
        String str2 = "pat";

        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        for(char c : str1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : str2.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)-1);
        }

        Collection<Integer> list = map1.values();
        for(Integer i :list){
            if(i != 0){

            }
        }
    }
}

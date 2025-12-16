package hashing;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<Character,String>();
        String[] strArray = s.split("\\s+");
        for(int i=0; i<pattern.length();i++){
            char key = pattern.charAt(i);
            String   temp = strArray[i];;
            if(map.containsKey(key)){
                String val =  map.get(key);

                if(!val.equalsIgnoreCase(temp))
                    return false;
            }
            else if(map.containsValue(temp)){
                return false;
            }
            else
            map.put(key,temp);
        }
        return true;
    }
    public static void main(String[] args){
    String pattern = "abba";
    String s = "dog cat cat dog";
        boolean flag =  wordPattern(pattern,s);
        System.out.println(flag);
    }
}

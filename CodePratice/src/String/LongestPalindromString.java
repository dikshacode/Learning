package String;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromString {
   static int findLengthOfPalindrom(String s) {
        int length = 0;
        char[] chars = s.toCharArray();
        System.out.println(chars[0]);
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                length +=2;
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty())
            length +=1;
        return length;
    }
    public static void main(String[] args){
        String s = "abccccdd";
    System.out.println(findLengthOfPalindrom(s));
    }
}

package String;

public class ReverseonlyChars {
    public static void main(String[] args){
        reverseOnlyLetters("ab-cd");
    }
    public static String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() -1 ;
        char[] charsArr = s.toCharArray();
        while(l < r){

            if(!Character.isAlphabetic(charsArr[l])){
                l++;
            }
            else if(!Character.isAlphabetic(charsArr[r])){
                r--;
            }
            else{
                char temp = charsArr[l];
                charsArr[l] = charsArr[r];
                charsArr[r] = temp;
                l++;
                r--;
            }
        }
        String ans = new String(charsArr);
        return ans;
    }
}

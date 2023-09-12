package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        Map<Character, Character> upperMap = new HashMap<Character, Character>();
        Map<Character, Character> lowerMap = new HashMap<Character, Character>();
        ArrayList<Character> upperAlpabet = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
        ArrayList<Character> lowerAlpabet = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        for(int i = 25;i>=0;i--){
            int j = 25-i;
            upperMap.put(upperAlpabet.get(j),upperAlpabet.get(i));
            lowerMap.put(lowerAlpabet.get(j),lowerAlpabet.get(i));
        }
        for(int i=0; i<word.length();i++){
            if (Character.isLowerCase(word.charAt(i))){
                answer = answer + lowerMap.get(word.charAt(i));
            }else if(Character.isUpperCase(word.charAt(i))){
                answer = answer + upperMap.get(word.charAt(i));
            }else{
                answer = answer + ' ';
            }
        }
        return answer;
    }
}

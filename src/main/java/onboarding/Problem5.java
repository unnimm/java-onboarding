package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<Integer>();
        List<Integer> divide = new ArrayList<Integer>(Arrays.asList(50000,10000,5000,1000,500,100,50,10,1));
        for(int i = 0;i<9;i++){
            int a = money/divide.get(i);
            money = money % divide.get(i);
            answer.add(a);
            System.out.println(answer);
        }
        return answer;
    }
}

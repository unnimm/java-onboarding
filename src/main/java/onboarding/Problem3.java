package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for (int num = 1; num <= number; num++) {
            String numStr = Integer.toString(num);
            for(int i=0; i<numStr.length();i++) {
                if(numStr.charAt(i) == '3'||numStr.charAt(i) == '6'||numStr.charAt(i) == '9'){
                    answer++;
                }
            }
        }
        return answer;
    }
}

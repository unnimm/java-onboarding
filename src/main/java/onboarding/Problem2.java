package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        int len = cryptogram.length();
        for (int i = 0; i < len - 1; i++) {
            int sameCount = 0;
            for (int j = 1; j <= len - 1; j++) {
                if (cryptogram.charAt(i) == cryptogram.charAt(i + j))
                    sameCount += 1;
                else break;
            }
            if (sameCount == 0) continue;
            cryptogram = cryptogram.substring(0, i) + cryptogram.substring(i + sameCount + 1);
            len -= sameCount + 1;
            i = -1;
        }
        return cryptogram;
    }

}

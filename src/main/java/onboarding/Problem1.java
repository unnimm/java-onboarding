package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if ((pobi.get(1) - pobi.get(0)) != 1 || (crong.get(1) - crong.get(0)) != 1) {
            return -1;
        }

        ArrayList<Integer> pobiList = new ArrayList<Integer>();
        ArrayList<Integer> crongList = new ArrayList<Integer>();
        //pobi, crong 곱하기랑 더하기
        for (int i = 0; i < 2; i++) {
            int pobiPlus = 0;
            int pobiMultiply = 1;
            int crongPlus = 0;
            int crongMultiply = 1;
            String pobiString = Integer.toString(pobi.get(i));
            String crongString = Integer.toString(crong.get(i));
            //121을 1,2,1로 쪼개기
            for (int j = 0; j < pobiString.length(); j++) {
                char pobiStr = pobiString.charAt(j);
                pobiPlus += Character.getNumericValue(pobiStr);
                pobiMultiply *= Character.getNumericValue(pobiStr);
            }
            pobiList.add(pobiPlus);
            pobiList.add(pobiMultiply);
            for (int j = 0; j < crongString.length(); j++) {
                char crongStr = crongString.charAt(j);
                crongPlus += Character.getNumericValue(crongStr);
                crongMultiply *= Character.getNumericValue(crongStr);
            }
            crongList.add(crongPlus);
            crongList.add(crongMultiply);
        }
        //pobiList의 최댓값, crongList의 최댓값 구하기
        int pobiMax = Collections.max(pobiList);
        int crongMax = Collections.max(crongList);

        System.out.println(pobiList);
        System.out.println(crongList);
        System.out.println(pobiMax);
        System.out.println(crongMax);

        //pobi가 큰지 crong이 큰지 확인하는 코드
        if (pobiMax > crongMax) {
            return 1;
        } else if (pobiMax < crongMax) {
            return 2;
        } else {
            return 0;
        }
    }
}
package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        // 닉네임,key 이메일,value 들어 있는 Map 생성
        Map<String, String> formsMap = new HashMap();
        ArrayList<List> sliceTotalList = new ArrayList();
        for (int i = 0; i < forms.size(); i++) {
            List<String> form = forms.get(i);
            String nickName = form.get(1);
            String email = form.get(0);
            formsMap.put(nickName, email);
            //2,3,4.. 문자열 쪼개기
            ArrayList<String> sliceList = new ArrayList();
            for (int j = 0; j < nickName.length() - 1; j++) {
                for (int k = 2; k <= nickName.length() - j; k++) {
                    String slice = nickName.substring(j, j + k);
                    sliceList.add(slice);
                }
            }
            sliceTotalList.add(sliceList);

            // n =0 -> i가 오른쪽으로 옮겨가면서 m=0,1,2, m=0,1,2 m=0,1 이렇게 하고 싶은데 코드를 어케짜는지 모르겠음
            int count = 0;
            for (int n = 0; n < sliceList.size(); n++) {
                for (int m = 0, k = 0; m < sliceTotalList.get(i + k).size(); m++) {
                    if (sliceTotalList.get(i).get(n) == sliceTotalList.get(i + k).get(m)) {
                        count++;
                        System.out.println(count);
                    }
                    ++k;
                    System.out.println(k);
                    if(i+k >= sliceTotalList.size()) break;
                }

            }

        }
        return answer;
    }
}

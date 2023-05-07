import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String answerS = Integer.toString(n);
        
        for(int i = 0; i < answerS.length(); i++) {
            answer += answerS.charAt(i) - '0';
        }
        return answer;
    }
}
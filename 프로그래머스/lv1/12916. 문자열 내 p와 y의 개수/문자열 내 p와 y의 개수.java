class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 80 || s.charAt(i) == 112)
                cnt1++;
            else if(s.charAt(i) == 89 || s.charAt(i) == 121)
                cnt2++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if(cnt1 != cnt2)
            answer = false;

        return answer;
    }
}
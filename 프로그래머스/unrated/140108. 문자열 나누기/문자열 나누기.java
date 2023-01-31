class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 1;
        int cnt2 = 0;
        int index = 1;
        char a = s.charAt(0);
        
        while(index < s.length()){
            if (a == ' ') {
                a = s.charAt(index);
                index++;
                continue;
            }
            if (a == s.charAt(index)) {
                cnt1++;
            }else{
                cnt2++;
            }
            if (cnt1 == cnt2) {
                answer++;
                a = ' ';
                cnt1 = 1;
                cnt2 = 0;
            }
            index++;
        }
        
        if (a != ' ') {
            answer++;
        }

        return answer;
    }
}
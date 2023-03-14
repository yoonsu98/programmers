class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        
        for(int i = left ; i <= right; i++) {
            int num = 1;
            for(int j = 2; j <= i; j++) {
                if(i % j == 0) {
                    num++;
                }
            }
            if(num % 2 == 0)
                even+=i;
            else
                odd+=i;
            answer = even-odd;
        }
        return answer;
    }
}
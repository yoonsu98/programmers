class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int q = 0;
        int r = 0;
        
        while(a<=n) {
            q = n/a*b;
            r = n%a;
            answer += q;
            n = r+q;
        }
        return answer;
    }
}
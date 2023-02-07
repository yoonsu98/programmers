class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 2;
        while(n % number != 1) {
            number++;
        }
        answer = number;
        return answer;
    }
}
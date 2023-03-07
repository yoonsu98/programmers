class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt = 0;
        int length = number.length;
        int i = 0;
        int j = i+1;
        int k = j+1;
        
        while(true)
        {
            if(number[i] + number[j] + number[k] == 0)
                answer++;
            if(i == length-3 && j == length-2 && k == length-1)
                break;
            if(j == number.length-2 && k == number.length-1){
                i++;
                j = i+1;
                k = j+1;
                continue;
            }
            if(k == number.length-1) {
                j++;
                k = j;
            }
            k++;
        }
        return answer;
    }
}
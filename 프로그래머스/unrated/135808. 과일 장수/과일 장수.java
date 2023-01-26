import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int temp = 0;
        int number = score.length;
        
        Arrays.sort(score);
        // while(number > 0) {
        //     for(int i = 0; i < score.length-1; i++) {
        //         if(score[i] > score[i+1]) {
        //             temp = score[i];
        //             score[i] = score[i+1];
        //             score[i+1] = temp;
        //         }
        //     }
        //     number--;
        // }
        
        int rest = score.length-m;
        while(rest > -1) {
            answer+= score[rest]*m;
            rest -= m;
        }
        return answer;
    }
}
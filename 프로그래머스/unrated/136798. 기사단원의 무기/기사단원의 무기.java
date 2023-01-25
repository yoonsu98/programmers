import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1; //1인경우 미리 더하기
        
        while(number > 1) {
            int seq = number;
            int i = 2;
            
            /* 약수 리스트 */
            HashMap<Integer, Integer> cnt = new HashMap<>();
            
            while(true) {
                if(seq % i == 0) {
                    if(!cnt.containsKey(i))
                        cnt.put(i,1);
                    else{
                        int val = cnt.get(i);
                        cnt.put(i,val+1);
                    }
                        
                    seq = seq / i;
                    i = 2;
                    
                    /*나눈수가 1이 되면 break*/
                    if(seq == 1){
                        int weight = 1;
                        
                        Collection<Integer> values = cnt.values();
                        
                        for (Integer value : values) {
                            weight *= value+1;
                        }
                        
                        if(weight > limit)
                            answer += power;
                        else
                            answer += weight;
                        break;   
                    }
                }
                else
                    i++;
            }
            number --;
        }
        return answer;
    }
}
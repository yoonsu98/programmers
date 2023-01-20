class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            String com = s.substring(0,i);
            //indexOf("찾는문자",시작위치)
            //lastIndexOf("찾는문자",시작위치)
            int index = com.lastIndexOf(s.charAt(i));
            if(index != -1) {
                index = i - index;
            }
            answer[i] =index;
       }   
        
        return answer;
    }
}
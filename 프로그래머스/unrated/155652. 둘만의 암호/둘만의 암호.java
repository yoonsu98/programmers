class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            int num = index;
            
            for(int j =1; j <= num; j++) {
                int alpha = s.charAt(i) + j;
                while(alpha > 122) {
                    alpha -= 26;
                }
                String c_alpha = Character.toString((char)alpha);
                if(skip.contains(c_alpha)){
                    num++;
                }
            }
            int letter = s.charAt(i)+num;
            while(letter > 122) {
                letter -= 26;
            }
            answer+=(char)letter;
        }
        return answer;
    }
}
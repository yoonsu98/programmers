class Solution {
    public int solution(String s) {
        int answer = 0;
        String[][] arr = {{"0","zero"},{"1","one"},{"2","two"}
                          ,{"3","three"},{"4","four"},{"5","five"}
                          ,{"6","six"},{"7","seven"},{"8","eight"},{"9","nine"}};
        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i][1])) {
                s=s.replace(arr[i][1],arr[i][0]);
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
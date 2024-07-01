package org.ki.level0.p120851;
// 숨어있는 숫자의 덧셈 (1)
public class Main {
}

class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        int answer = 0;
        for(String str : arr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}

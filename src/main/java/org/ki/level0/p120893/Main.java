package org.ki.level0.p120893;
// 대문자 소문자
public class Main {
}

class Solution {
    char al;
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            al = my_string.charAt(i);

            if(Character.isUpperCase(al)) {
                answer += Character.toLowerCase(al);
            } else {
                answer += Character.toUpperCase(al);
            }
        }
        return answer;
    }
}

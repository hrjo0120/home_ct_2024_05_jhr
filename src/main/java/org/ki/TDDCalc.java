package org.ki;

//과제 : 10 - 10 - 10 - 10 + 10 + 10 - 10 - 완료
public class TDDCalc {
    public static int run(String exp) {

        System.out.println(exp);    // 바꾸기 전

        exp = exp.replaceAll("- ", "+ -");// -로 들어온 경우 + -로 치환

        System.out.println(exp);    //바꾼 후

        String[] bits = exp.split(" \\+ "); // + 로 자름

        int sum = 0;

//        int a = Integer.parseInt(bits[0]);
//        int b = Integer.parseInt(bits[1]);
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        int f = 0;
//        int g = 0;

        for(int i = 0; i<bits.length; i++) {
            sum += Integer.parseInt(bits[i]);
        }

//        if (bits.length > 2) {  // 항이 2개 이상일 때
//            c = Integer.parseInt(bits[2]);
//        }

        return sum;

//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아니야");
    }
}

package academy;

import java.util.StringTokenizer;

public class Test53 {
    public static void main(String[] args) {
//            [문제 53] 문자열변수에 "10*30*20*40*50"를 대입한후 StringTokenizer클래스를
//        이용하여 다음결과를구하시오
//
//        (1) Test53클래스 main()에서
//        //나머지를 완성하시오
//
//
//[결과화면]
//        10+30+20+40+50=150

        String str = "10*30*20*40*50";
        StringTokenizer stringTokenizer = new StringTokenizer(str, "*");

        int total = 0;

        while (true) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            total += number;
            System.out.print(number);
            if (!stringTokenizer.hasMoreTokens()) {
                break;
            }
            System.out.print("+");
        }
        System.out.print("=" + total);
    }
}

package academy;

import java.util.StringTokenizer;

public class Test53 {
    public static void main(String[] args) {
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

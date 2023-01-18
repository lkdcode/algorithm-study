package academy;

import java.util.Calendar;

public class Test51 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int lucky = (int) (Math.random() * 100) + 1;
        System.out.println(year + "년 " + month + "월 " + day + "일 당신의 금전운은 " + lucky + "% 입니다.");
    }
}

package academy;

public class Test52 {
    public static void main(String[] args) {
        String str = "IT ELITE";
        System.out.println(str.charAt(4) + "\t" + str.charAt(1));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(3));
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'I') {
                System.out.print(str.toLowerCase().charAt(i));
            } else {
                System.out.print(str.toUpperCase().charAt(i));
            }
        }
    }
}
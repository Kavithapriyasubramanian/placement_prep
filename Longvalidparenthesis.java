import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = longs(s);
        System.out.println(res);
    }

    public static int longs(String s) {
        int open = 0;
        int close = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                int len = open + close;
                max = Math.max(max, len);
            } else if (close > open) {
                open = close = 0;
            }
        }

        open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                int len = open + close;
                max = Math.max(max, len);
            } else if (close < open) {
                open = close = 0;
            }
        }

        return max;
    }
}

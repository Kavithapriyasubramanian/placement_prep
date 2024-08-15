import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] result = longpalindromesubstring(s);
        //System.out.println("Length of Longest Palindromic Substring: " + result[0]);
        System.out.println(s.substring(result[1], result[1] + result[0]));
    }

    public static int[] longpalindromesubstring(String s) {
        int maxLen = 0;
        int start = 0;
        int n = s.length();
        int[][] dp = new int[n][n];

        // Initialize base cases
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
            maxLen = 1;
            start=i;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                start = i;
                maxLen = 2;
            }
        }

        // Check for substrings of length greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    start = i;
                    maxLen = len;
                }
            }
        }
        return new int[]{maxLen, start};
    }
}

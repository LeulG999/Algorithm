package Lesson4;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 10; // change n as needed

        // base cases
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        // fill table
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println("Number of Ways to climb " + n + " stairs = " + dp[n]);
    }
}
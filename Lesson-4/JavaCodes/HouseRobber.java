package Lesson4;

public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        int n = houses.length;

        int[] dp = new int[n];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + houses[i]);
        }

        System.out.println("Max money = " + dp[n-1]);
    }
}
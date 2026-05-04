package Lesson4;

public class SubsetSum {

    public static void main(String[] args) {

        int[] S = {3, 4, 7, 8};
        int k = 15;
        int n = S.length;
        boolean[][] A = new boolean[n][k + 1];
        for (int i = 0; i < n; i++) {
            A[i][0] = true;
            A[0][S[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                A[i][j] = A[i - 1][j];
                if (j >= S[i]) {
                    A[i][j] = A[i][j] || A[i - 1][j - S[i]];
                }

            }
        }
        System.out.println(A[n-1][k] ? "T" : "F");

    }
}

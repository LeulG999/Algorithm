package Lesson4;

public class SubsetSum3 {

    static boolean[][] A;
    static int[] S;

    public static void main(String[] args) {
        S = new int[]{3, 4, 7, 8};
        int k = 15;
        int n = S.length;

        A = new boolean[n][k + 1];
        for (int i = 0; i < n; i++) {
            A[i][0] = true;
        }
        A[0][S[0]] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                A[i][j] = A[i-1][j];
                if (j >= S[i]) {
                    A[i][j] = A[i][j] || A[i-1][j - S[i]];
                }
            }
        }
        System.out.println("All solutions:");
        findAll(n-1, k, "");
    }
    static void findAll(int i, int j, String solution) {
        if (i == 0) {
            if (j == S[0]) {
                System.out.println("T = {" + S[0] + ", " + solution + "}");
            } else if (j == 0) {
                System.out.println("T = {" + solution + "}");
            }
            return;
        }
        if (A[i-1][j]) {
            findAll(i-1, j, solution);
        }
        if (j >= S[i] && A[i-1][j - S[i]]) {
            findAll(i-1, j - S[i], solution + S[i] + " ");
        }
    }
}

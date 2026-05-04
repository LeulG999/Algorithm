package Lesson4;

public class SubsetSum2 {

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
        if (A[n-1][k]) {
            System.out.println("T");
        } else {
            System.out.println("F");
            return;
        }
        findOne(n-1, k);
    }

    static void findOne(int i, int j) {
        if (i == 0) {
            if (j == S[0]) {
                System.out.print(S[0] + " ");
            }
            return;
        }
        if (A[i-1][j]) {
            findOne(i-1, j);
        } else {
            System.out.print(S[i] + " ");
            findOne(i-1, j - S[i]);
        }
    }
}

package Lesson11;
public class FuseHeap {
    public static int[] fuseHeap(int[] h1, int[] h2) {
        int n = h1.length + h2.length;
        int[] h3 = new int[n + 1];

        int count = 1;

        for(int i = 0; i < h1.length; i++) {
            h3[count++] = h1[i];
        }

        for(int i = 0; i < h2.length; i++) {
            h3[count++] = h2[i];
        }
        for(int i = n/2; i >= 1; i--) {

            int c1 = 2*i;
            int c2 = 2*i + 1;

            if(c1 <= n && h3[c1] > h3[i] &&
                    (c2 > n || h3[c1] > h3[c2])) {

                int temp = h3[i];
                h3[i] = h3[c1];
                h3[c1] = temp;
            }
            else if(c2 <= n && h3[c2] > h3[i] &&
                    h3[c2] > h3[c1]) {

                int temp = h3[i];
                h3[i] = h3[c2];
                h3[c2] = temp;
            }
        }
        return h3;
    }
}

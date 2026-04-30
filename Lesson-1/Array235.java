
public class Array235 {
    public static void main(String[] args) {
        int[] arr = {10, 16, 21, 8, 25};
       int[] arr2={30,16,21,8,25};
        System.out.println(isArray123(arr)); // Algorithm 3
       System.out.println(is123Array(arr2)); // Algorithm 4
        }
    public static int isArray123(int[] arr) {
        int n = arr.length;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int countNot = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count2++;
            }
            if (arr[i] % 3 == 0) {
                count3++;
            }
            if (arr[i] % 5 == 0) {
                count5++;
            }
            if (arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0) {
                countNot++;
            }
        }
            if (count2 + count3 + count5 + countNot == n) {
                   return 1;
            }
            return 0;
        }
        public static int is123Array(int[] arr){
        int n=arr.length;
            for (int i = 0; i < n; i++) {
                int count=0;
                if (arr[i] % 2 == 0) {
                    count++;
                }
                if (arr[i] % 3 == 0) {
                    count++;
                }
                if (arr[i] % 5 == 0) {
                    count++;
                }
                if(count>1){
                    return 0;
                }
            }
            return 1;
        }
    }



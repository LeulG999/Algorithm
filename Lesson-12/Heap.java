package Lesson12;
class Heap {

    int size=0;
    int minIndex;
    int[] heap = new int[20];


    public void insert(int x) {
        heap[++size] = x;

        if(size == 1 || heap[size] < heap[minIndex]) {
            minIndex = size;
        }

        int current = size;

        while(current > 1 &&
                heap[current] > heap[current / 2]) {

            swap(heap, current, current / 2);

            current = current / 2;
        }
    }

    public int getMinIndex() {
        return minIndex;
    }
    public static void swap(int[] heap, int i, int j) {

        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
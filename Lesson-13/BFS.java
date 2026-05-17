package Lesson13;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

public static void main(String[] args) {

int[][] graph = {
        {0,1,1,0,0,1,0,0,0},
        {1,0,0,0,0,1,0,0,0},
        {1,0,0,0,0,1,1,0,0},
        {0,0,0,0,1,0,0,0,1},
        {0,0,0,1,0,0,0,0,1},
        {1,1,1,0,0,0,0,1,0},
        {0,0,1,0,0,0,0,1,0},
        {0,0,0,0,0,1,1,0,0},
        {0,0,0,1,1,0,0,0,0}
};

boolean[] visited = new boolean[9];
Queue<Integer> queue = new LinkedList<>();

for (int i = 0; i < graph.length; i++) {
    if (!visited[i]) {
        visited[i] = true;
        queue.add(i);
        System.out.print("Component: ");

        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");

            for (int j = 0; j < graph[current].length; j++) {
                if (graph[current][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
        System.out.println();
    }
}
}
}

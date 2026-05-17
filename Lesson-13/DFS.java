package Lesson13;
import java.util.Stack;

public class DFS {
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
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {

            if (!visited[i]) {
                visited[i] = true;
                stack.push(i);
                System.out.print("Component: ");

                while (!stack.isEmpty()) {
                    int current = stack.peek();
                    System.out.print(current + " ");
                    boolean found = false;

                    for (int j = 0; j < graph[current].length; j++) {
                        if (graph[current][j] == 1 && !visited[j]) {
                            visited[j] = true;
                            stack.push(j);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        stack.pop();
                    }
                }
                System.out.println();
            }
        }
    }
}
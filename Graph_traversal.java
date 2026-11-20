
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Graph_traversal 
{
    static ArrayList<Integer> graph[];
    static boolean visited[];

    static void bfs(int start, int n) {

        boolean seen[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        seen[start] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for (int next : graph[node]) {
                if (!seen[next]) {
                    seen[next] = true;
                    q.add(next);
                }
            }
        }
    }

    static void dfs(int node) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        System.out.println("BFS Traversal:");
        bfs(start, n);

        System.out.println("\nDFS Traversal:");
        visited = new boolean[n];
        dfs(start);
    }
    
}

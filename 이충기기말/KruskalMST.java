// 프로그램 7-3 : 주어진 연결된 비방향 가중 그래프의 최소 비용 신장 트리를 찾는 알고리즘

package 이충기기말;

import java.util.Scanner;

public class KruskalMST {
    private class Edge implements Comparable<Edge>{
        int src, dest, weight;
        public int compareTo(Edge compareEdge){
            return this.weight - compareEdge.weight;
        }
    };

    private class subset{
        int parent;
        int rank;
    };
    int V;
    int E;
    Edge edge[];

    KruskalMST(int v, int e){
        V = v;
        E = e;
        edge = new Edge[E];
        for(int i=0; i < E; i++){
            edge[i] = new Edge();
        }

        int find(subset subset[], int i){
            if(subsets[i].parent != i)
        }
    }
    public static void main(String[] args){
        int V = 5; // 그래프내 정점의 개수
        int E = 7; // 그래프내 간선들의 개수
        Scanner sc = new Scanner(System.in);
        KruskalMST graph = new KruskalMST(V, E); // 주어진 연결된 가중치가 있는 비방향 그래프를 만든다.
        System.out.println("간선의 두 정점들과 가중치를 차례대로 입력하세요"); //그래프내 간선의 두정점들과 가중치를 입력받는다.
        for(int i=0; i < E; i++){
            graph.edge[i].src = sc.nextInt();
            graph.edge[i].dest = sc.nextInt();
            graph.edge[i].weight = sc.nextInt();
        }
        graph.KruskalMST(); // 크루스칼 알고리즘을 이용하여 최소비용 신장 트리를 찾는다.

    }
}

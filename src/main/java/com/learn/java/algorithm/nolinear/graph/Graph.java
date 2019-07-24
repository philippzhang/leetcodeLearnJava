package com.learn.java.algorithm.nolinear.graph;

import com.learn.java.algorithm.linear.queue.LinkQueue;
import com.learn.java.algorithm.linear.stack.LinkStack;
import com.learn.java.algorithm.nolinear.node.GraphKind;
import com.learn.java.algorithm.nolinear.node.Vertex;

import static com.learn.java.algorithm.nolinear.node.GraphKind.*;


/**
 * 图：邻接矩阵存储结构
 */
public class Graph<T> {
	//表示顶点的最大个数
	private final int MAX_VERTS;
	//表示无、有向网中的无穷大
	public final static int INFINITY = Integer.MAX_VALUE;
	//图的种类标志
	private GraphKind kind;
	//顶点数
	private int vexNum;

	//顶点数组
	private Vertex<T>[] vexs;
	//邻接矩阵
	private int[][] adjMat;

	public Graph(GraphKind kind) {
		this(kind,10);
	}

	public Graph(GraphKind kind,int MAX_VERTS) {
		this.MAX_VERTS = MAX_VERTS;
		this.kind =kind;
		vexs = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		//初始化顶点个数为0
		vexNum = 0;
		//初始化邻接矩阵所有元素都为0，即所有顶点都没有边
		for(int i = 0; i < MAX_VERTS; i++) {
			for(int j = 0; j < MAX_VERTS; j++) {
				if(kind.equals(UDG)||kind.equals(DG)) {
					adjMat[i][j] = 0;
				}else if(kind.equals(UDN)||kind.equals(DN)) {
					adjMat[i][j] = INFINITY;
				}
			}
		}
	}



	public GraphKind getKind() {
		return kind;
	}

	public int getVexNum() {
		return vexNum;
	}

	public int[][] adjMat() {
		return adjMat;
	}

	public Vertex<T>[] getVexs() {
		return vexs;
	}

	public Vertex<T> getVex(int v) {
		if (v <0 || v >= vexNum) {
			throw new RuntimeException("该顶点不存在:" + v);
		}
		return vexs[v];
	}


	//顶点定位算法
	private int locateVex(T obj) {
		for (int v = 0; v < vexNum; v++) {
			if (vexs[v].getLabel().equals(obj)) {
				return v;
			}
		}
		return -1;
	}

	//将顶点添加到数组中，是否访问标志置为wasVisited=false(未访问)
	public void addVertex(T lab) {
		vexs[vexNum++] = new Vertex(lab);
	}

	public void addEdge(T start, T end) {
		addEdge(start,end,1);
	}

	//注意用邻接矩阵表示边，是对称的，两部分都要赋值
	public void addEdge(T start, T end,int value) {
		int u = locateVex(start);
		int v = locateVex(end);
		adjMat[u][v] = value;
		if(kind.equals(UDG)||kind.equals(UDN)){
			//无向图
			adjMat[v][u] = value;
		}
	}

	//查找第一个邻接点
	//0<=v<vexNum
	public int firstAdjVex(int v,boolean[] visited) {
		if (v < 0 || v >= vexNum) {
			throw new RuntimeException("该顶点不存在:" + v);
		}
		for (int j = 0; j < vexNum; j++) {
			//遍历第v行的元素查找
			if (adjMat[v][j] > 0 && adjMat[v][j] < INFINITY&&!visited[j]) {
				return j;
			}
		}
		return -1;
	}

	//查找下一个邻接点
	//查找v的一个邻接点w，之后的下一个邻接点
	public int nextAdjVex(int v, int w,boolean[] visited) {
		if (v < 0 || v >= vexNum) {
			throw new RuntimeException("该顶点不存在:" + v);
		}
		if (w < 0 || w >= vexNum) {
			throw new RuntimeException("该顶点不存在:" + w);
		}
		for (int j = w+1; j < vexNum; j++) {
			//遍历第v行的元素查找
			if (adjMat[v][j] > 0 && adjMat[v][j] < INFINITY&&!visited[j]) {
				return j;
			}
		}
		return -1;
	}

	//打印某个顶点表示的值
	private void displayVertex(int v) {
		System.out.print(this.getVex(v).getLabel()+" ");
	}

	/**
	 * 广度优先遍历算法BFS
	 * 类似于数的层次遍历
	 */
	public void BFSTraverse() {
		boolean[] visited = new boolean[this.getVexNum()];
		for (int v = 0; v < this.getVexNum(); v++) {
			//初始化false，表示未访问
			visited[v] = false;
		}
		for (int v = 0; v < this.getVexNum(); v++) {
			//使用循环是避免漏掉非联通图的点
			BFS(visited,v);
		}
	}
	private void BFS(boolean[] visited,int v) {
		//顶点v未被访问时
		if (!visited[v]) {
			visited[v] = true;
			this.displayVertex(v);
			LinkQueue Q = new LinkQueue();
			Q.insert(v);
			while (!Q.isEmpty()) {
				//队头元素出队
				int u = (Integer) Q.poll();
				for (int w = this.firstAdjVex(u,visited); w >= 0; w = this.nextAdjVex(u, w,visited)) {
						visited[w] = true;
						this.displayVertex(w);
						Q.insert(w);
				}
			}
		}
	}

	/**
	 * 深度优先遍历算法DFS
	 * 类似于数的先根遍历
	 */
	public void DFSTraverse() {
		boolean[] visited = new boolean[this.getVexNum()];
		for (int v = 0; v < this.getVexNum(); v++) {
			//初始化false，表示未访问
			visited[v] = false;
		}
		for (int v = 0; v < this.getVexNum(); v++) {
			DFS(visited,v);
		}
	}
	private void DFS(boolean[] visited,int v) {
		if (!visited[v]) {
			//顶点v未被访问时
			visited[v] = true;
			this.displayVertex(v);
			for (int w = this.firstAdjVex(v,visited); w >= 0; w = this.nextAdjVex(v, w,visited)) {
				DFS(visited, w);
			}
		}
	}

	/**
	 * 非递归实现图遍历
	 */
	public void DFSTraverse2() {
		boolean[] visited = new boolean[this.getVexNum()];
		for (int v = 0; v < this.getVexNum(); v++) {
			//初始化false，表示未访问
			visited[v] = false;
		}
		for (int v = 0; v < this.getVexNum(); v++) {
			DFS2(visited,v);
		}
	}
	private void DFS2(boolean[] visited,int v) {
		//顶点v未被访问时
		if (!visited[v]) {
			visited[v] = true;
			this.displayVertex(v);
			LinkStack S = new LinkStack<>();
			S.push(v);
			while (!S.isEmpty()) {
				int u =this.firstAdjVex((Integer)S.peek(),visited);
				if(u==-1){
					S.pop();
				}else{
					visited[u] = true;
					this.displayVertex(u);
					S.push(u);
				}

			}
		}
	}

	public void mst() {
		boolean[] visited = new boolean[this.getVexNum()];
		for (int v = 0; v < this.getVexNum(); v++) {
			//初始化false，表示未访问
			visited[v] = false;
		}
		LinkStack<Integer> S = new LinkStack<>();
		S.push(0);
		visited[0] = true;

		while (!S.isEmpty()) {
			int currentVertex = S.peek();
			int v = firstAdjVex(currentVertex,visited);
			if (v == -1) {
				S.pop();
			} else {
				visited[v] = true;
				S.push(v);

				displayVertex(currentVertex);
				displayVertex(v);
				System.out.print(" ");
			}
		}

	}

	public static void main(String[] args) {
		Graph<String> graph = new Graph(UDG);
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");


		graph.addEdge("A", "B");
		graph.addEdge("B", "C");
		graph.addEdge("A", "D");
		graph.addEdge("D", "E");

		System.out.print("深度优先遍历:");
		graph.DFSTraverse();
		System.out.println();

		System.out.print("广度优先遍历:");
		graph.BFSTraverse();
		System.out.println();

		System.out.print("深度优先遍历:");
		graph.DFSTraverse2();
		System.out.println();

		System.out.print("最小生成树:");
		graph.mst();
		System.out.println();

	}

}

# [928. Minimize Malware Spread II][enTitle]

**Hard**

You are given a network of  *n*  nodes represented as an  *n x n*  adjacency matrix  *graph* , where the  *ith*  node is directly connected to the  *jth*  node if  *graph[i][j] == 1* .

Some nodes  *initial*  are initially infected by malware. Whenever two nodes are directly connected, and at least one of those two nodes is infected by malware, both nodes will be infected by malware. This spread of malware will continue until no more nodes can be infected in this manner.

Suppose  *M(initial)*  is the final number of nodes infected with malware in the entire network after the spread of malware stops.

We will remove **exactly one node**  from  *initial* , **completely removing it and any connections from this node to any other node** .

Return the node that, if removed, would minimize  *M(initial)* . If multiple nodes could be removed to minimize  *M(initial)* , return such a node with **the smallest index** .



**Example 1:** 

```
Input: graph = [[1,1,0],[1,1,0],[0,0,1]], initial = [0,1]
Output: 0

```

**Example 2:** 

```
Input: graph = [[1,1,0],[1,1,1],[0,1,1]], initial = [0,1]
Output: 1

```

**Example 3:** 

```
Input: graph = [[1,1,0,0],[1,1,1,0],[0,1,1,1],[0,0,1,1]], initial = [0,1]
Output: 1

```



**Constraints:** 

-  *n == graph.length*  
-  *n == graph[i].length*  
-  *2 <= n <= 300*  
-  *graph[i][j]*  is  *0*  or  *1* . 
-  *graph[i][j] == graph[j][i]*  
-  *graph[i][i] == 1*  
-  *1 <= initial.length < n*  
-  *0 <= initial[i] <= n - 1*  
- All the integers in  *initial*  are **unique** .


# [928. 尽量减少恶意软件的传播 II][cnTitle]

**困难**

(这个问题与  *尽量减少恶意软件的传播* 是一样的，不同之处用粗体表示。)

在节点网络中，只有当  *graph[i][j] = 1*  时，每个节点  *i*  能够直接连接到另一个节点  *j* 。

一些节点  *initial*  最初被恶意软件感染。只要两个节点直接连接，且其中至少一个节点受到恶意软件的感染，那么两个节点都将被恶意软件感染。这种恶意软件的传播将继续，直到没有更多的节点可以被这种方式感染。

假设  *M(initial)*  是在恶意软件停止传播之后，整个网络中感染恶意软件的最终节点数。

我们可以从初始列表中删除一个节点，**并完全移除该节点以及从该节点到任何其他节点的任何连接。** 如果移除这一节点将最小化  *M(initial)* ， 则返回该节点。如果有多个节点满足条件，就返回索引最小的节点。





**示例 1：** 

```
输出：graph = [[1,1,0],[1,1,0],[0,0,1]], initial = [0,1]
输入：0

```

**示例 2：** 

```
输入：graph = [[1,1,0],[1,1,1],[0,1,1]], initial = [0,1]
输出：1

```

**示例 3：** 

```
输入：graph = [[1,1,0,0],[1,1,1,0],[0,1,1,1],[0,0,1,1]], initial = [0,1]
输出：1

```



**提示：** 

1.  *1 < graph.length = graph[0].length <= 300*  
2.  *0 <= graph[i][j] == graph[j][i] <= 1*  
3.  *graph[i][i] = 1*  
4.  *1 <= initial.length < graph.length*  
5.  *0 <= initial[i] < graph.length* 




# 算法思路

# 测试用例
```
928. Minimize Malware Spread II 928. 尽量减少恶意软件的传播 II Hard
```

[enTitle]: https://leetcode.com/problems/minimize-malware-spread-ii/
[cnTitle]: https://leetcode-cn.com/problems/minimize-malware-spread-ii/

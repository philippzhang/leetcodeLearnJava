# [797. All Paths From Source to Target][enTitle]

**Medium**

Given a directed acyclic graph (**DAG** ) of  *n*  nodes labeled from 0 to n - 1, find all possible paths from node  *0*  to node  *n - 1* , and return them in any order.

The graph is given as follows:  *graph[i]*  is a list of all nodes you can visit from node  *i*  (i.e., there is a directed edge from node  *i*  to node  *graph[i][j]* ).



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/28/all_1.jpg)

```
Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/09/28/all_2.jpg)

```
Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]

```

**Example 3:** 

```
Input: graph = [[1],[]]
Output: [[0,1]]

```

**Example 4:** 

```
Input: graph = [[1,2,3],[2],[3],[]]
Output: [[0,1,2,3],[0,2,3],[0,3]]

```

**Example 5:** 

```
Input: graph = [[1,3],[2],[3],[]]
Output: [[0,1,2,3],[0,3]]

```



**Constraints:** 

-  *n == graph.length*  
-  *2 <= n <= 15*  
-  *0 <= graph[i][j] < n*  
-  *graph[i][j] != i*  (i.e., there will be no self-loops). 
- The input graph is **guaranteed**  to be a **DAG** .


# [797. 所有可能的路径][cnTitle]

**中等**

给一个有  *n*  个结点的有向无环图，找到所有从  *0*  到  *n-1*  的路径并输出（不要求按顺序）

二维数组的第  *i*  个数组中的单元都表示有向图中  *i*  号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a ）空就是没有下一个结点了。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/09/28/all_1.jpg)

```
输入：graph = [[1,2],[3],[3],[]]
输出：[[0,1,3],[0,2,3]]
解释：有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/09/28/all_2.jpg)

```
输入：graph = [[4,3,1],[3,2,4],[3],[4],[]]
输出：[[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]

```

**示例 3：** 

```
输入：graph = [[1],[]]
输出：[[0,1]]

```

**示例 4：** 

```
输入：graph = [[1,2,3],[2],[3],[]]
输出：[[0,1,2,3],[0,2,3],[0,3]]

```

**示例 5：** 

```
输入：graph = [[1,3],[2],[3],[]]
输出：[[0,1,2,3],[0,3]]

```



**提示：** 

- 结点的数量会在范围  *[2, 15]*  内。 
- 你可以把路径以任意顺序输出，但在路径内的结点的顺序必须保证。




# 算法思路

# 测试用例
```
797. All Paths From Source to Target 797. 所有可能的路径 Medium
```

[enTitle]: https://leetcode.com/problems/all-paths-from-source-to-target/
[cnTitle]: https://leetcode-cn.com/problems/all-paths-from-source-to-target/

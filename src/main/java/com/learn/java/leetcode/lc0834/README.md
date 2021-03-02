# [834. Sum of Distances in Tree][enTitle]

**Hard**

An undirected, connected tree with  *N*  nodes labelled  *0...N-1*  and  *N-1*   *edges*  are given.

The  *i* th edge connects nodes  *edges[i][0]* and *edges[i][1]*  together.

Return a list  *ans* , where  *ans[i]*  is the sum of the distances between node  *i*  and all other nodes.

**Example 1:** 

```
Input:N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output:[8,12,6,10,10,10]
Explanation:
Here is a diagram of the given tree:
  0
 / \
1   2
   /|\
  3 4 5
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.  Hence, answer[0] = 8, and so on.

```

Note:1 <= N <= 10000


# [834. 树中距离之和][cnTitle]

**困难**

给定一个无向、连通的树。树中有  *N*  个标记为  *0...N-1*  的节点以及  *N-1*  条边 。

第  *i*  条边连接节点  *edges[i][0]*  和  *edges[i][1]*  。

返回一个表示节点  *i*  与其他所有节点距离之和的列表  *ans* 。

**示例 1:** 

```
输入:N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
输出:[8,12,6,10,10,10]
解释:
如下为给定的树的示意图：
  0
 / \
1   2
   /|\
  3 4 5

我们可以计算出 dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5) 
也就是 1 + 1 + 2 + 2 + 2 = 8。 因此，answer[0] = 8，以此类推。

```

**说明:**   *1 <= N <= 10000* 




# 算法思路

# 测试用例
```
834. Sum of Distances in Tree 834. 树中距离之和 Hard
```

[enTitle]: https://leetcode.com/problems/sum-of-distances-in-tree/
[cnTitle]: https://leetcode-cn.com/problems/sum-of-distances-in-tree/

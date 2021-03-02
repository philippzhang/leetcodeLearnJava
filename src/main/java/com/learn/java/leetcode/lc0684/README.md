# [684. Redundant Connection][enTitle]

**Medium**

In this problem, a tree is an undirected graph that is connected and has no cycles.

The given input is a graph that started as a tree with N nodes (with distinct values 1, 2, ..., N), with one additional edge added. The added edge has two different vertices chosen from 1 to N, and was not an edge that already existed.

The resulting graph is given as a 2D-array of  *edges* . Each element of  *edges*  is a pair  *[u, v]*  with  *u < v* , that represents an undirected edge connecting nodes  *u*  and  *v* .

Return an edge that can be removed so that the resulting graph is a tree of N nodes. If there are multiple answers, return the answer that occurs last in the given 2D-array. The answer edge  *[u, v]*  should be in the same format, with  *u < v* .

Example 1:

```
Input: [[1,2], [1,3], [2,3]]
Output: [2,3]
Explanation: The given undirected graph will be like this:
  1
 / \
2 - 3

```



Example 2:

```
Input: [[1,2], [2,3], [3,4], [1,4], [1,5]]
Output: [1,4]
Explanation: The given undirected graph will be like this:
5 - 1 - 2
    |   |
    4 - 3

```



Note:






Update (2017-09-26): We have overhauled the problem description + test cases and specified clearly the graph is an undirected graph. For the directed graph follow up please see Redundant Connection II). We apologize for any inconvenience caused.


# [684. 冗余连接][cnTitle]

**中等**

在本问题中, 树指的是一个连通且无环的**无向** 图。

输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。

结果图是一个以 *边* 组成的二维数组。每一个 *边* 的元素是一对 *[u, v]*  ，满足  *u < v* ，表示连接顶点 *u*  和 *v* 的**无向** 图的边。

返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边  *[u, v]*  应满足相同的格式  *u < v* 。

**示例 1：** 

```
输入: [[1,2], [1,3], [2,3]]
输出: [2,3]
解释: 给定的无向图为:
  1
 / \
2 - 3

```

**示例 2：** 

```
输入: [[1,2], [2,3], [3,4], [1,4], [1,5]]
输出: [1,4]
解释: 给定的无向图为:
5 - 1 - 2
    |   |
    4 - 3

```

**注意:** 

- 输入的二维数组大小在 3 到 1000。 
- 二维数组中的整数在1到N之间，其中N是输入数组的大小。

**更新(2017-09-26):**  我们已经重新检查了问题描述及测试用例，明确图是 *无向* 图。对于有向图详见**冗余连接II。** 对于造成任何不便，我们深感歉意。




# 算法思路

# 测试用例
```
684. Redundant Connection 684. 冗余连接 Medium
```

[enTitle]: https://leetcode.com/problems/redundant-connection/
[cnTitle]: https://leetcode-cn.com/problems/redundant-connection/

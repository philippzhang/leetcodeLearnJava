# [1617. Count Subtrees With Max Distance Between Cities][enTitle]

**Hard**

There are  *n*  cities numbered from  *1*  to  *n* . You are given an array  *edges*  of size  *n-1* , where  *edges[i] = [ui, vi]*  represents a bidirectional edge between cities  *ui*  and  *vi* . There exists a unique path between each pair of cities. In other words, the cities form a **tree** .

A **subtree**  is a subset of cities where every city is reachable from every other city in the subset, where the path between each pair passes through only the cities from the subset. Two subtrees are different if there is a city in one subtree that is not present in the other.

For each  *d*  from  *1*  to  *n-1* , find the number of subtrees in which the **maximum distance**  between any two cities in the subtree is equal to  *d* .

Return  *an array of size*   *n-1*   *where the*  *dth*  *element (1-indexed) is the number of subtrees in which the maximum distance between any two cities is equal to*  *d* .

**Notice**  that the **distance**  between the two cities is the number of edges in the path between them.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/21/p1.png)

```
Input: n = 4, edges = [[1,2],[2,3],[2,4]]
Output: [3,4,0]
Explanation:The subtrees with subsets {1,2}, {2,3} and {2,4} have a max distance of 1.
The subtrees with subsets {1,2,3}, {1,2,4}, {2,3,4} and {1,2,3,4} have a max distance of 2.
No subtree has two nodes where the max distance between them is 3.

```

**Example 2:** 

```
Input: n = 2, edges = [[1,2]]
Output: [1]

```

**Example 3:** 

```
Input: n = 3, edges = [[1,2],[2,3]]
Output: [2,1]

```



**Constraints:** 

-  *2 <= n <= 15*  
-  *edges.length == n-1*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n*  
- All pairs  *(ui, vi)*  are distinct.


# [1617. 统计子树中城市之间最大距离][cnTitle]

**困难**

给你  *n*  个城市，编号为从  *1*  到  *n*  。同时给你一个大小为  *n-1*  的数组  *edges*  ，其中  *edges[i] = [ui, vi]*  表示城市  *ui*  和  *vi* <sub> </sub>之间有一条双向边。题目保证任意城市之间只有唯一的一条路径。换句话说，所有城市形成了一棵 **树**  。

一棵 **子树**  是城市的一个子集，且子集中任意城市之间可以通过子集中的其他城市和边到达。两个子树被认为不一样的条件是至少有一个城市在其中一棵子树中存在，但在另一棵子树中不存在。

对于  *d*  从  *1*  到  *n-1*  ，请你找到城市间 **最大距离**  恰好为  *d*  的所有子树数目。

请你返回一个大小为  *n-1*  的数组，其中第 *d* 个元素（**下标从 1 开始** ）是城市间 **最大距离**  恰好等于  *d*  的子树数目。

**请注意** ，两个城市间距离定义为它们之间需要经过的边的数目。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/11/p1.png)

```
输入：n = 4, edges = [[1,2],[2,3],[2,4]]
输出：[3,4,0]
解释：子树 {1,2}, {2,3} 和 {2,4} 最大距离都是 1 。
子树 {1,2,3}, {1,2,4}, {2,3,4} 和 {1,2,3,4} 最大距离都为 2 。
不存在城市间最大距离为 3 的子树。

```

**示例 2：** 

```
输入：n = 2, edges = [[1,2]]
输出：[1]

```

**示例 3：** 

```
输入：n = 3, edges = [[1,2],[2,3]]
输出：[2,1]

```



**提示：** 

-  *2 <= n <= 15*  
-  *edges.length == n-1*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n*  
- 题目保证  *(ui, vi)*  所表示的边互不相同。




# 算法思路

# 测试用例
```
1617. Count Subtrees With Max Distance Between Cities 1617. 统计子树中城市之间最大距离 Hard
```

[enTitle]: https://leetcode.com/problems/count-subtrees-with-max-distance-between-cities/
[cnTitle]: https://leetcode-cn.com/problems/count-subtrees-with-max-distance-between-cities/

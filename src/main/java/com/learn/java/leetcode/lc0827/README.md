# [827. Making A Large Island][enTitle]

**Hard**

You are given an  *n x n*  binary matrix  *grid* . You are allowed to change **at most one**   *0*  to be  *1* .

Return  *the size of the largest island in*   *grid*   *after applying this operation* .

An **island**  is a 4-directionally connected group of  *1* s.



**Example 1:** 

```
Input: grid = [[1,0],[0,1]]
Output: 3
Explanation: Change one 0 to 1 and connect two 1s, then we get an island with area = 3.

```

**Example 2:** 

```
Input: grid = [[1,1],[1,0]]
Output: 4
Explanation:Change the 0 to 1 and make the island bigger, only one island with area = 4.
```

**Example 3:** 

```
Input: grid = [[1,1],[1,1]]
Output: 4
Explanation: Can't change any 0 to 1, only one island with area = 4.

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 500*  
-  *grid[i][j]*  is either  *0*  or  *1* .


# [827. 最大人工岛][cnTitle]

**困难**

在二维地图上，  *0* 代表海洋，  *1* 代表陆地，我们最多只能将一格  *0*  海洋变成  *1* 变成陆地。

进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的  *1*  可形成岛屿）

**示例 1:** 

```
输入:[[1, 0], [0, 1]]
输出: 3
解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。

```

**示例 2:** 

```
输入:[[1, 1], [1, 0]]
输出: 4
解释: 将一格0变成1，岛屿的面积扩大为 4。
```

**示例 3:** 

```
输入:[[1, 1], [1, 1]]
输出: 4
解释: 没有0可以让我们变成1，面积依然为 4。
```

**说明:** 

-  *1 <= grid.length = grid[0].length <= 50*  
-  *0 <= grid[i][j] <= 1* 




# 算法思路

# 测试用例
```
827. Making A Large Island 827. 最大人工岛 Hard
```

[enTitle]: https://leetcode.com/problems/making-a-large-island/
[cnTitle]: https://leetcode-cn.com/problems/making-a-large-island/

# [1219. Path with Maximum Gold][enTitle]

**Medium**

In a gold mine  *grid*  of size  *m * n* , each cell in this mine has an integer representing the amount of gold in that cell,  *0*  if it is empty.

Return the maximum amount of gold you can collect under the conditions:

- Every time you are located in a cell you will collect all the gold in that cell. 
- From your position you can walk one step to the left, right, up or down. 
- You can't visit the same cell more than once. 
- Never visit a cell with  *0*  gold. 
- You can start and stop collecting gold from **any** position in the grid that has some gold.



**Example 1:** 

```
Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
Output: 24
Explanation:
[[0,6,0],
 [5,8,7],
 [0,9,0]]
Path to get the maximum gold, 9 -> 8 -> 7.

```

**Example 2:** 

```
Input: grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
Output: 28
Explanation:
[[1,0,7],
 [2,0,6],
 [3,4,5],
 [0,3,0],
 [9,0,20]]
Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.

```



**Constraints:** 

-  *1 <= grid.length, grid[i].length <= 15*  
-  *0 <= grid[i][j] <= 100*  
- There are at most **25** cells containing gold.


# [1219. 黄金矿工][cnTitle]

**中等**

你要开发一座金矿，地质勘测学家已经探明了这座金矿中的资源分布，并用大小为  *m * n*  的网格  *grid*  进行了标注。每个单元格中的整数就表示这一单元格中的黄金数量；如果该单元格是空的，那么就是  *0* 。

为了使收益最大化，矿工需要按以下规则来开采黄金：

- 每当矿工进入一个单元，就会收集该单元格中的所有黄金。 
- 矿工每次可以从当前位置向上下左右四个方向走。 
- 每个单元格只能被开采（进入）一次。 
- **不得开采** （进入）黄金数目为  *0*  的单元格。 
- 矿工可以从网格中 **任意一个**  有黄金的单元格出发或者是停止。



**示例 1：** 

```
输入：grid = [[0,6,0],[5,8,7],[0,9,0]]
输出：24
解释：
[[0,6,0],
 [5,8,7],
 [0,9,0]]
一种收集最多黄金的路线是：9 -> 8 -> 7。

```

**示例 2：** 

```
输入：grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
输出：28
解释：
[[1,0,7],
 [2,0,6],
 [3,4,5],
 [0,3,0],
 [9,0,20]]
一种收集最多黄金的路线是：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7。

```



**提示：** 

-  *1 <= grid.length, grid[i].length <= 15*  
-  *0 <= grid[i][j] <= 100*  
- 最多 **25** 个单元格中有黄金。




# 算法思路

# 测试用例
```
1219. Path with Maximum Gold 1219. 黄金矿工 Medium
```

[enTitle]: https://leetcode.com/problems/path-with-maximum-gold/
[cnTitle]: https://leetcode-cn.com/problems/path-with-maximum-gold/

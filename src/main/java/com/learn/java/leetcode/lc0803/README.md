# [803. Bricks Falling When Hit][enTitle]

**Hard**

You are given an  *m x n*  binary  *grid* , where each  *1*  represents a brick and  *0*  represents an empty space. A brick is **stable**  if:

- It is directly connected to the top of the grid, or 
- At least one other brick in its four adjacent cells is **stable** .

You are also given an array  *hits* , which is a sequence of erasures we want to apply. Each time we want to erase the brick at the location  *hits[i] = (rowi, coli)* . The brick on that location (if it exists) will disappear. Some other bricks may no longer be stable because of that erasure and will **fall** . Once a brick falls, it is **immediately**  erased from the  *grid*  (i.e., it does not land on other stable bricks).

Return  *an array*  *result*  *, where each*  *result[i]*  *is the number of bricks that will fall after the*  *ith*  *erasure is applied.* 

**Note**  that an erasure may refer to a location with no brick, and if it does, no bricks drop.



**Example 1:** 

```
Input: grid = [[1,0,0,0],[1,1,1,0]], hits = [[1,0]]
Output: [2]
Explanation:Starting with the grid:
[[1,0,0,0],
 [1,1,1,0]]
We erase the underlined brick at (1,0), resulting in the grid:
[[1,0,0,0],
 [0,1,1,0]]
The two underlined bricks are no longer stable as they are no longer connected to the top nor adjacent to another stable brick, so they will fall. The resulting grid is:
[[1,0,0,0],
 [0,0,0,0]]
Hence the result is [2].

```

**Example 2:** 

```
Input: grid = [[1,0,0,0],[1,1,0,0]], hits = [[1,1],[1,0]]
Output: [0,0]
Explanation:Starting with the grid:
[[1,0,0,0],
 [1,1,0,0]]
We erase the underlined brick at (1,1), resulting in the grid:
[[1,0,0,0],
 [1,0,0,0]]
All remaining bricks are still stable, so no bricks fall. The grid remains the same:
[[1,0,0,0],
 [1,0,0,0]]
Next, we erase the underlined brick at (1,0), resulting in the grid:
[[1,0,0,0],
 [0,0,0,0]]
Once again, all remaining bricks are still stable, so no bricks fall.
Hence the result is [0,0].

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 200*  
-  *grid[i][j]*  is  *0*  or  *1* . 
-  *1 <= hits.length <= 4 * 104*  
-  *hits[i].length == 2*  
-  *0 <= xi <= m - 1*  
-  *0 <= yi <= n - 1*  
- All  *(xi, yi)*  are unique.


# [803. 打砖块][cnTitle]

**困难**

有一个  *m x n*  的二元网格，其中  *1*  表示砖块， *0*  表示空白。砖块 **稳定** （不会掉落）的前提是：

- 一块砖直接连接到网格的顶部，或者 
- 至少有一块相邻（4 个方向之一）砖块**稳定** 不会掉落时

给你一个数组  *hits*  ，这是需要依次消除砖块的位置。每当消除  *hits[i] = (rowi, coli)*  位置上的砖块时，对应位置的砖块（若存在）会消失，然后其他的砖块可能因为这一消除操作而掉落。一旦砖块掉落，它会立即从网格中消失（即，它不会落在其他稳定的砖块上）。

返回一个数组  *result*  ，其中  *result[i]*  表示第  *i*  次消除操作对应掉落的砖块数目。

**注意** ，消除可能指向是没有砖块的空白位置，如果发生这种情况，则没有砖块掉落。



**示例 1：** 

```
输入：grid = [[1,0,0,0],[1,1,1,0]], hits = [[1,0]]
输出：[2]
解释：
网格开始为：
[[1,0,0,0]，
 [1,1,1,0]]
消除 (1,0) 处加粗的砖块，得到网格：
[[1,0,0,0]
 [0,1,1,0]]
两个加粗的砖不再稳定，因为它们不再与顶部相连，也不再与另一个稳定的砖相邻，因此它们将掉落。得到网格：
[[1,0,0,0],
 [0,0,0,0]]
因此，结果为 [2] 。

```

**示例 2：** 

```
输入：grid = [[1,0,0,0],[1,1,0,0]], hits = [[1,1],[1,0]]
输出：[0,0]
解释：
网格开始为：
[[1,0,0,0],
 [1,1,0,0]]
消除 (1,1) 处加粗的砖块，得到网格：
[[1,0,0,0],
 [1,0,0,0]]
剩下的砖都很稳定，所以不会掉落。网格保持不变：
[[1,0,0,0], 
 [1,0,0,0]]
接下来消除 (1,0) 处加粗的砖块，得到网格：
[[1,0,0,0],
 [0,0,0,0]]
剩下的砖块仍然是稳定的，所以不会有砖块掉落。
因此，结果为 [0,0] 。
```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 200*  
-  *grid[i][j]*  为  *0*  或  *1*  
-  *1 <= hits.length <= 4 * 104*  
-  *hits[i].length == 2*  
-  *0 <= xi <= m - 1*  
-  *0 <= yi <= n - 1*  
- 所有  *(xi, yi)*  互不相同




# 算法思路

# 测试用例
```
803. Bricks Falling When Hit 803. 打砖块 Hard
```

[enTitle]: https://leetcode.com/problems/bricks-falling-when-hit/
[cnTitle]: https://leetcode-cn.com/problems/bricks-falling-when-hit/

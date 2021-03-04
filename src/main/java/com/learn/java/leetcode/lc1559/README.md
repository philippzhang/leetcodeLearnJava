# [1559. Detect Cycles in 2D Grid][enTitle]

**Hard**

Given a 2D array of characters  *grid*  of size  *m x n* , you need to find if there exists any cycle consisting of the **same value**  in  *grid* .

A cycle is a path of **length 4 or more**  in the grid that starts and ends at the same cell. From a given cell, you can move to one of the cells adjacent to it - in one of the four directions (up, down, left, or right), if it has the **same value**  of the current cell.

Also, you cannot move to the cell that you visited in your last move. For example, the cycle  *(1, 1) -> (1, 2) -> (1, 1)*  is invalid because from  *(1, 2)*  we visited  *(1, 1)*  which was the last visited cell.

Return  *true*  if any cycle of the same value exists in  *grid* , otherwise, return  *false* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/07/15/1.png)


<pre><strong>Input:</strong> grid = [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
<strong>Output:</strong> true
<strong>Explanation: </strong>There are two valid cycles shown in different colors in the image below:
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/15/11.png" style="width: 225px; height: 163px;">
</pre>

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/07/15/22.png)


<pre><strong>Input:</strong> grid = [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
<strong>Output:</strong> true
<strong>Explanation: </strong>There is only one valid cycle highlighted in the image below:
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/15/2.png" style="width: 229px; height: 157px;">
</pre>

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/07/15/3.png)

```
Input: grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
Output: false

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 500*  
-  *1 <= n <= 500*  
-  *grid*  consists only of lowercase English letters.


# [1559. 二维网格图中探测环][cnTitle]

**困难**

给你一个二维字符网格数组  *grid*  ，大小为  *m x n*  ，你需要检查  *grid*  中是否存在 **相同值**  形成的环。

一个环是一条开始和结束于同一个格子的长度 **大于等于 4**  的路径。对于一个给定的格子，你可以移动到它上、下、左、右四个方向相邻的格子之一，可以移动的前提是这两个格子有 **相同的值** 。

同时，你也不能回到上一次移动时所在的格子。比方说，环  *(1, 1) -> (1, 2) -> (1, 1)*  是不合法的，因为从  *(1, 2)*  移动到  *(1, 1)*  回到了上一次移动时的格子。

如果  *grid*  中有相同值形成的环，请你返回  *true*  ，否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e1.png)


<pre><strong>输入：</strong>grid = [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
<strong>输出：</strong>true
<strong>解释：</strong>如下图所示，有 2 个用不同颜色标出来的环：
<img style="height: 163px; width: 225px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e11.png" alt="">
</pre>

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e2.png)


<pre><strong>输入：</strong>grid = [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
<strong>输出：</strong>true
<strong>解释：</strong>如下图所示，只有高亮所示的一个合法环：
<img style="height: 157px; width: 229px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e22.png" alt="">
</pre>

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e3.png)

```
输入：grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
输出：false

```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 500*  
-  *1 <= n <= 500*  
-  *grid*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1559. Detect Cycles in 2D Grid 1559. 二维网格图中探测环 Hard
```

[enTitle]: https://leetcode.com/problems/detect-cycles-in-2d-grid/
[cnTitle]: https://leetcode-cn.com/problems/detect-cycles-in-2d-grid/

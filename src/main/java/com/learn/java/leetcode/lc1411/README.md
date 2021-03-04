# [1411. Number of Ways to Paint N × 3 Grid][enTitle]

**Hard**

You have a  *grid*  of size  *n x 3*  and you want to paint each cell of the grid with exactly one of the three colors: **Red** , **Yellow,**  or **Green**  while making sure that no two adjacent cells have the same color (i.e., no two cells that share vertical or horizontal sides have the same color).

Given  *n*  the number of rows of the grid, return  *the number of ways*  you can paint this  *grid* . As the answer may grow large, the answer **must be**  computed modulo  *109 + 7* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/03/26/e1.png)

```
Input: n = 1
Output: 12
Explanation: There are 12 possible way to paint the grid as shown.

```

**Example 2:** 

```
Input: n = 2
Output: 54

```

**Example 3:** 

```
Input: n = 3
Output: 246

```

**Example 4:** 

```
Input: n = 7
Output: 106494

```

**Example 5:** 

```
Input: n = 5000
Output: 30228214

```



**Constraints:** 

-  *n == grid.length*  
-  *grid[i].length == 3*  
-  *1 <= n <= 5000* 


# [1411. 给 N x 3 网格图涂色的方案数][cnTitle]

**困难**

你有一个  *n x 3*  的网格图  *grid*  ，你需要用 **红，黄，绿**  三种颜色之一给每一个格子上色，且确保相邻格子颜色不同（也就是有相同水平边或者垂直边的格子颜色不同）。

给你网格图的行数  *n*  。

请你返回给  *grid*  涂色的方案数。由于答案可能会非常大，请你返回答案对  *10^9 + 7*  取余的结果。



**示例 1：** 


<pre><strong>输入：</strong>n = 1
<strong>输出：</strong>12
<strong>解释：</strong>总共有 12 种可行的方法：
<img style="height: 289px; width: 450px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/04/12/e1.png" alt="">
</pre>

**示例 2：** 

```
输入：n = 2
输出：54

```

**示例 3：** 

```
输入：n = 3
输出：246

```

**示例 4：** 

```
输入：n = 7
输出：106494

```

**示例 5：** 

```
输入：n = 5000
输出：30228214

```



**提示：** 

-  *n == grid.length*  
-  *grid[i].length == 3*  
-  *1 <= n <= 5000* 




# 算法思路

# 测试用例
```
1411. Number of Ways to Paint N × 3 Grid 1411. 给 N x 3 网格图涂色的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-paint-n-3-grid/

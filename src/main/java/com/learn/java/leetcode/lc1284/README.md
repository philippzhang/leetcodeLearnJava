# [1284. Minimum Number of Flips to Convert Binary Matrix to Zero Matrix][enTitle]

**Hard**

Given a  *m x n*  binary matrix  *mat* . In one step, you can choose one cell and flip it and all the four neighbours of it if they exist (Flip is changing 1 to 0 and 0 to 1). A pair of cells are called neighboors if they share one edge.

Return the  *minimum number of steps*  required to convert  *mat*  to a zero matrix or **-1**  if you cannot.

Binary matrix is a matrix with all cells equal to 0 or 1 only.

Zero matrix is a matrix with all cells equal to 0.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/11/28/matrix.png)

```
Input: mat = [[0,0],[0,1]]
Output: 3
Explanation: One possible solution is to flip (1, 0) then (0, 1) and finally (1, 1) as shown.

```

**Example 2:** 

```
Input: mat = [[0]]
Output: 0
Explanation: Given matrix is a zero matrix. We don't need to change it.

```

**Example 3:** 

```
Input: mat = [[1,1,1],[1,0,1],[0,0,0]]
Output: 6

```

**Example 4:** 

```
Input: mat = [[1,0,0],[1,0,0]]
Output: -1
Explanation: Given matrix can't be a zero matrix

```



**Constraints:** 

-  *m == mat.length*  
-  *n == mat[0].length*  
-  *1 <= m <= 3*  
-  *1 <= n <= 3*  
-  *mat[i][j]*  is 0 or 1.


# [1284. 转化为全零矩阵的最少反转次数][cnTitle]

**困难**

给你一个  *m x n*  的二进制矩阵  *mat* 。

每一步，你可以选择一个单元格并将它反转（反转表示 0 变 1 ，1 变 0 ）。如果存在和它相邻的单元格，那么这些相邻的单元格也会被反转。（注：相邻的两个单元格共享同一条边。）

请你返回将矩阵  *mat*  转化为全零矩阵的 *最少反转次数* ，如果无法转化为全零矩阵，请返回 **-1**  。

二进制矩阵的每一个格子要么是 0 要么是 1 。

全零矩阵是所有格子都为 0 的矩阵。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/12/13/matrix.png)

```
输入：mat = [[0,0],[0,1]]
输出：3
解释：一个可能的解是反转 (1, 0)，然后 (0, 1) ，最后是 (1, 1) 。

```

**示例 2：** 

```
输入：mat = [[0]]
输出：0
解释：给出的矩阵是全零矩阵，所以你不需要改变它。

```

**示例 3：** 

```
输入：mat = [[1,1,1],[1,0,1],[0,0,0]]
输出：6

```

**示例 4：** 

```
输入：mat = [[1,0,0],[1,0,0]]
输出：-1
解释：该矩阵无法转变成全零矩阵

```



**提示：** 

-  *m == mat.length*  
-  *n == mat[0].length*  
-  *1 <= m <= 3*  
-  *1 <= n <= 3*  
-  *mat[i][j]*  是 0 或 1 。




# 算法思路

# 测试用例
```
1284. Minimum Number of Flips to Convert Binary Matrix to Zero Matrix 1284. 转化为全零矩阵的最少反转次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix/

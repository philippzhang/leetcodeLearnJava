# [1504. Count Submatrices With All Ones][enTitle]

**Medium**

Given a  *rows * columns*  matrix  *mat*  of ones and zeros, return how many **submatrices**  have all ones.



**Example 1:** 

```
Input: mat = [[1,0,1],
              [1,1,0],
              [1,1,0]]
Output: 13
Explanation:There are 6 rectangles of side 1x1.
There are 2 rectangles of side 1x2.
There are 3 rectangles of side 2x1.
There is 1 rectangle of side 2x2. 
There is 1 rectangle of side 3x1.
Total number of rectangles = 6 + 2 + 3 + 1 + 1 = 13.

```

**Example 2:** 

```
Input: mat = [[0,1,1,0],
              [0,1,1,1],
              [1,1,1,0]]
Output: 24
Explanation:
There are 8 rectangles of side 1x1.
There are 5 rectangles of side 1x2.
There are 2 rectangles of side 1x3. 
There are 4 rectangles of side 2x1.
There are 2 rectangles of side 2x2. 
There are 2 rectangles of side 3x1. 
There is 1 rectangle of side 3x2. 
Total number of rectangles = 8 + 5 + 2 + 4 + 2 + 2 + 1 = 24.

```

**Example 3:** 

```
Input: mat = [[1,1,1,1,1,1]]
Output: 21

```

**Example 4:** 

```
Input: mat = [[1,0,1],[0,1,0],[1,0,1]]
Output: 5

```



**Constraints:** 

-  *1 <= rows <= 150*  
-  *1 <= columns <= 150*  
-  *0 <= mat[i][j] <= 1* 


# [1504. 统计全 1 子矩形][cnTitle]

**中等**

给你一个只包含 0 和 1 的  *rows * columns*  矩阵  *mat*  ，请你返回有多少个 **子矩形**  的元素全部都是 1 。



**示例 1：** 

```
输入：mat = [[1,0,1],
            [1,1,0],
            [1,1,0]]
输出：13
解释：有 6 个 1x1 的矩形。
有 2 个 1x2 的矩形。
有 3 个 2x1 的矩形。
有 1 个 2x2 的矩形。
有 1 个 3x1 的矩形。
矩形数目总共 = 6 + 2 + 3 + 1 + 1 = 13 。

```

**示例 2：** 

```
输入：mat = [[0,1,1,0],
            [0,1,1,1],
            [1,1,1,0]]
输出：24
解释：
有 8 个 1x1 的子矩形。
有 5 个 1x2 的子矩形。
有 2 个 1x3 的子矩形。
有 4 个 2x1 的子矩形。
有 2 个 2x2 的子矩形。
有 2 个 3x1 的子矩形。
有 1 个 3x2 的子矩形。
矩形数目总共 = 8 + 5 + 2 + 4 + 2 + 2 + 1 = 24。

```

**示例 3：** 

```
输入：mat = [[1,1,1,1,1,1]]
输出：21

```

**示例 4：** 

```
输入：mat = [[1,0,1],[0,1,0],[1,0,1]]
输出：5

```



**提示：** 

-  *1 <= rows <= 150*  
-  *1 <= columns <= 150*  
-  *0 <= mat[i][j] <= 1* 




# 算法思路

# 测试用例
```
1504. Count Submatrices With All Ones 1504. 统计全 1 子矩形 Medium
```

[enTitle]: https://leetcode.com/problems/count-submatrices-with-all-ones/
[cnTitle]: https://leetcode-cn.com/problems/count-submatrices-with-all-ones/

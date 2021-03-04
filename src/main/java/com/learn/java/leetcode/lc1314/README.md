# [1314. Matrix Block Sum][enTitle]

**Medium**











**Example 1:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]

```

**Example 2:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]

```



**Constraints:** 

-  *m == mat.length*  
-  *n == mat[i].length*  
-  *1 <= m, n, K <= 100*  
-  *1 <= mat[i][j] <= 100* 


# [1314. 矩阵区域和][cnTitle]

**中等**

给你一个  *m * n*  的矩阵  *mat*  和一个整数  *K*  ，请你返回一个矩阵  *answer*  ，其中每个  *answer[i][j]*  是所有满足下述条件的元素  *mat[r][c]*  的和：

-  *i - K <= r <= i + K, j - K <= c <= j + K*   
-  *(r, c)*  在矩阵内。



**示例 1：** 

```
输入：mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
输出：[[12,21,16],[27,45,33],[24,39,28]]

```

**示例 2：** 

```
输入：mat = [[1,2,3],[4,5,6],[7,8,9]], K = 2
输出：[[45,45,45],[45,45,45],[45,45,45]]

```



**提示：** 

-  *m == mat.length*  
-  *n == mat[i].length*  
-  *1 <= m, n, K <= 100*  
-  *1 <= mat[i][j] <= 100* 




# 算法思路

# 测试用例
```
1314. Matrix Block Sum 1314. 矩阵区域和 Medium
```

[enTitle]: https://leetcode.com/problems/matrix-block-sum/
[cnTitle]: https://leetcode-cn.com/problems/matrix-block-sum/

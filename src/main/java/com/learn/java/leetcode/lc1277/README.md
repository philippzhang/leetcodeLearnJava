# [1277. Count Square Submatrices with All Ones][enTitle]

**Medium**

Given a  *m * n*  matrix of ones and zeros, return how many **square**  submatrices have all ones.



**Example 1:** 

```
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.

```

**Example 2:** 

```
Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.

```



**Constraints:** 

-  *1 <= arr.length <= 300*  
-  *1 <= arr[0].length <= 300*  
-  *0 <= arr[i][j] <= 1* 


# [1277. 统计全为 1 的正方形子矩阵][cnTitle]

**中等**

给你一个  *m * n*  的矩阵，矩阵中的元素不是  *0*  就是  *1* ，请你统计并返回其中完全由  *1*  组成的 **正方形**  子矩阵的个数。



**示例 1：** 

```
输入：matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
输出：15
解释： 
边长为 1 的正方形有 10 个。
边长为 2 的正方形有 4 个。
边长为 3 的正方形有 1 个。
正方形的总数 = 10 + 4 + 1 = 15.

```

**示例 2：** 

```
输入：matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
输出：7
解释：
边长为 1 的正方形有 6 个。 
边长为 2 的正方形有 1 个。
正方形的总数 = 6 + 1 = 7.

```



**提示：** 

-  *1 <= arr.length <= 300*  
-  *1 <= arr[0].length <= 300*  
-  *0 <= arr[i][j] <= 1* 




# 算法思路

# 测试用例
```
1277. Count Square Submatrices with All Ones 1277. 统计全为 1 的正方形子矩阵 Medium
```

[enTitle]: https://leetcode.com/problems/count-square-submatrices-with-all-ones/
[cnTitle]: https://leetcode-cn.com/problems/count-square-submatrices-with-all-ones/

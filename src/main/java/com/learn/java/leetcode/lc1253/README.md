# [1253. Reconstruct a 2-Row Binary Matrix][enTitle]

**Medium**

Given the following details of a matrix with  *n*  columns and  *2*  rows :

- The matrix is a binary matrix, which means each element in the matrix can be  *0*  or  *1* . 
- The sum of elements of the 0-th(upper) row is given as  *upper* . 
- The sum of elements of the 1-st(lower) row is given as  *lower* . 
- The sum of elements in the i-th column(0-indexed) is  *colsum[i]* , where  *colsum*  is given as an integer array with length  *n* .

Your task is to reconstruct the matrix with  *upper* ,  *lower*  and  *colsum* .

Return it as a 2-D integer array.

If there are more than one valid solution, any of them will be accepted.

If no valid solution exists, return an empty 2-D array.



**Example 1:** 

```
Input: upper = 2, lower = 1, colsum = [1,1,1]
Output: [[1,1,0],[0,0,1]]
Explanation:[[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.

```

**Example 2:** 

```
Input: upper = 2, lower = 3, colsum = [2,2,1,1]
Output: []

```

**Example 3:** 

```
Input: upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
Output: [[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]

```



**Constraints:** 

-  *1 <= colsum.length <= 10^5*  
-  *0 <= upper, lower <= colsum.length*  
-  *0 <= colsum[i] <= 2* 


# [1253. 重构 2 行二进制矩阵][cnTitle]

**中等**

给你一个  *2*  行  *n*  列的二进制数组：

- 矩阵是一个二进制矩阵，这意味着矩阵中的每个元素不是  *0*  就是  *1* 。 
- 第  *0*  行的元素之和为  *upper* 。 
- 第  *1*  行的元素之和为  *lower* 。 
- 第  *i*  列（从  *0*  开始编号）的元素之和为  *colsum[i]* ， *colsum*  是一个长度为  *n*  的整数数组。

你需要利用  *upper* ， *lower*  和  *colsum*  来重构这个矩阵，并以二维整数数组的形式返回它。

如果有多个不同的答案，那么任意一个都可以通过本题。

如果不存在符合要求的答案，就请返回一个空的二维数组。



**示例 1：** 

```
输入：upper = 2, lower = 1, colsum = [1,1,1]
输出：[[1,1,0],[0,0,1]]
解释：[[1,0,1],[0,1,0]] 和 [[0,1,1],[1,0,0]] 也是正确答案。

```

**示例 2：** 

```
输入：upper = 2, lower = 3, colsum = [2,2,1,1]
输出：[]

```

**示例 3：** 

```
输入：upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
输出：[[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]

```



**提示：** 

-  *1 <= colsum.length <= 10^5*  
-  *0 <= upper, lower <= colsum.length*  
-  *0 <= colsum[i] <= 2* 




# 算法思路

# 测试用例
```
1253. Reconstruct a 2-Row Binary Matrix 1253. 重构 2 行二进制矩阵 Medium
```

[enTitle]: https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/
[cnTitle]: https://leetcode-cn.com/problems/reconstruct-a-2-row-binary-matrix/

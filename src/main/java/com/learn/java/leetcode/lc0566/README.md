# [566. Reshape the Matrix][enTitle]

**Easy**

In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.

```



Example 2:

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

```



Note:

1. The height and width of the given matrix is in range [1, 100]. 
2. The given r and c are all positive.




# [566. 重塑矩阵][cnTitle]

**简单**

在MATLAB中，有一个非常有用的函数  *reshape* ，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。

给出一个由二维数组表示的矩阵，以及两个正整数 *r* 和 *c* ，分别表示想要的重构的矩阵的行数和列数。

重构后的矩阵需要将原始矩阵的所有元素以相同的**行遍历顺序** 填充。

如果具有给定参数的 *reshape* 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。

**示例 1:** 

```
输入: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
输出: 
[[1,2,3,4]]
解释:
行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。

```

**示例 2:** 

```
输入: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
输出: 
[[1,2],
 [3,4]]
解释:
没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。

```

**注意：** 

1. 给定矩阵的宽和高范围在 [1, 100]。 
2. 给定的 r 和 c 都是正数。




# 算法思路

# 测试用例
```
566. Reshape the Matrix 566. 重塑矩阵 Easy
```

[enTitle]: https://leetcode.com/problems/reshape-the-matrix/
[cnTitle]: https://leetcode-cn.com/problems/reshape-the-matrix/

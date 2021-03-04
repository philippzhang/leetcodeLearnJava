# [1072. Flip Columns For Maximum Number of Equal Rows][enTitle]

**Medium**

You are given an  *m x n*  binary matrix  *matrix* .

You can choose any number of columns in the matrix and flip every cell in that column (i.e., Change the value of the cell from  *0*  to  *1*  or vice versa).

Return  *the maximum number of rows that have all values equal after some number of flips* .



**Example 1:** 

```
Input: matrix = [[0,1],[1,1]]
Output: 1
Explanation: After flipping no values, 1 row has all values equal.

```

**Example 2:** 

```
Input: matrix = [[0,1],[1,0]]
Output: 2
Explanation: After flipping values in the first column, both rows have equal values.

```

**Example 3:** 

```
Input: matrix = [[0,0,0],[0,0,1],[1,1,0]]
Output: 2
Explanation: After flipping values in the first two columns, the last two rows have equal values.

```



**Constraints:** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 300*  
-  *matrix[i][j]*  is either  *0*  or  *1* .


# [1072. 按列翻转得到最大值等行数][cnTitle]

**中等**

给定由若干 0 和 1 组成的矩阵  *matrix* ，从中选出任意数量的列并翻转其上的 **每个** 单元格。翻转后，单元格的值从 0 变成 1，或者从 1 变为 0 。

回经过一些翻转后，行与行之间所有值都相等的最大行数。





**示例 1：** 

```
输入：[[0,1],[1,1]]
输出：1
解释：不进行翻转，有 1 行所有值都相等。

```

**示例 2：** 

```
输入：[[0,1],[1,0]]
输出：2
解释：翻转第一列的值之后，这两行都由相等的值组成。

```

**示例 3：** 

```
输入：[[0,0,0],[0,0,1],[1,1,0]]
输出：2
解释：翻转前两列的值之后，后两行由相等的值组成。
```



**提示：** 

1.  *1 <= matrix.length <= 300*  
2.  *1 <= matrix[i].length <= 300*  
3. 所有  *matrix[i].length*  都相等 
4.  *matrix[i][j]*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1072. Flip Columns For Maximum Number of Equal Rows 1072. 按列翻转得到最大值等行数 Medium
```

[enTitle]: https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/
[cnTitle]: https://leetcode-cn.com/problems/flip-columns-for-maximum-number-of-equal-rows/

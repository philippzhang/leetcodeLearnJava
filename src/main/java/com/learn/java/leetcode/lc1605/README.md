# [1605. Find Valid Matrix Given Row and Column Sums][enTitle]

**Medium**

You are given two arrays  *rowSum*  and  *colSum*  of non-negative integers where  *rowSum[i]*  is the sum of the elements in the  *ith*  row and  *colSum[j]*  is the sum of the elements of the  *jth*  column of a 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums of each row and column.

Find any matrix of **non-negative**  integers of size  *rowSum.length x colSum.length*  that satisfies the  *rowSum*  and  *colSum*  requirements.

Return  *a 2D array representing any matrix that fulfills the requirements* . It's guaranteed that **at least one** matrix that fulfills the requirements exists.



**Example 1:** 

```
Input: rowSum = [3,8], colSum = [4,7]
Output: [[3,0],
         [1,7]]
Explanation:
0th row: 3 + 0 = 3 == rowSum[0]
1st row: 1 + 7 = 8 == rowSum[1]
0th column: 3 + 1 = 4 == colSum[0]
1st column: 0 + 7 = 7 == colSum[1]
The row and column sums match, and all matrix elements are non-negative.
Another possible matrix is: [[1,2],
                             [3,5]]

```

**Example 2:** 

```
Input: rowSum = [5,7,10], colSum = [8,6,8]
Output: [[0,5,0],
         [6,1,0],
         [2,0,8]]

```

**Example 3:** 

```
Input: rowSum = [14,9], colSum = [6,9,8]
Output: [[0,9,5],
         [6,0,3]]

```

**Example 4:** 

```
Input: rowSum = [1,0], colSum = [1]
Output: [[1],
         [0]]

```

**Example 5:** 

```
Input: rowSum = [0], colSum = [0]
Output: [[0]]

```



**Constraints:** 

-  *1 <= rowSum.length, colSum.length <= 500*  
-  *0 <= rowSum[i], colSum[i] <= 108*  
-  *sum(rows) == sum(columns)* 


# [1605. 给定行和列的和求可行矩阵][cnTitle]

**中等**

给你两个非负整数数组  *rowSum*  和  *colSum*  ，其中  *rowSum[i]*  是二维矩阵中第  *i*  行元素的和，  *colSum[j]*  是第  *j*  列元素的和。换言之你不知道矩阵里的每个元素，但是你知道每一行和每一列的和。

请找到大小为  *rowSum.length x colSum.length*  的任意 **非负整数**  矩阵，且该矩阵满足  *rowSum*  和  *colSum*  的要求。

请你返回任意一个满足题目要求的二维矩阵，题目保证存在 **至少一个**  可行矩阵。



**示例 1：** 

```
输入：rowSum = [3,8], colSum = [4,7]
输出：[[3,0],
      [1,7]]
解释：
第 0 行：3 + 0 = 3 == rowSum[0]
第 1 行：1 + 7 = 8 == rowSum[1]
第 0 列：3 + 1 = 4 == colSum[0]
第 1 列：0 + 7 = 7 == colSum[1]
行和列的和都满足题目要求，且所有矩阵元素都是非负的。
另一个可行的矩阵为：[[1,2],
                  [3,5]]

```

**示例 2：** 

```
输入：rowSum = [5,7,10], colSum = [8,6,8]
输出：[[0,5,0],
      [6,1,0],
      [2,0,8]]

```

**示例 3：** 

```
输入：rowSum = [14,9], colSum = [6,9,8]
输出：[[0,9,5],
      [6,0,3]]

```

**示例 4：** 

```
输入：rowSum = [1,0], colSum = [1]
输出：[[1],
      [0]]

```

**示例 5：** 

```
输入：rowSum = [0], colSum = [0]
输出：[[0]]

```



**提示：** 

-  *1 <= rowSum.length, colSum.length <= 500*  
-  *0 <= rowSum[i], colSum[i] <= 108*  
-  *sum(rows) == sum(columns)* 




# 算法思路

# 测试用例
```
1605. Find Valid Matrix Given Row and Column Sums 1605. 给定行和列的和求可行矩阵 Medium
```

[enTitle]: https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/
[cnTitle]: https://leetcode-cn.com/problems/find-valid-matrix-given-row-and-column-sums/
